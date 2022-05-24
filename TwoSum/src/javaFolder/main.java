package javaFolder;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 13;
        int[] array = new int[2];



        for (int x: findIndexes3(nums, target)) {
            System.out.print(x + " ");
        }
//        for (int x: array) {
//            System.out.print(x + " ");
//        }

    }

    public static int[] findIndexes(int[] nums, int target){
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    answer[0] = i;
                    if(i != j) {
                        answer[1] = j;
                    }
                }
            }
        }

        return answer;
    }
    public static int[] findIndexes2(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if ((i != j) && (nums[i] + nums[j] == target)){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }

        return null;
    }
    public static int[] findIndexes3(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer requiredNum = (Integer)(target - nums[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(nums[i], i);
        }
        return null;
    }
}
