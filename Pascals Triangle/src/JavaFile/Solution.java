package JavaFile;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        numRows -= 1;
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

//        creating list of lists
        for (int i = 0; i < binomialTheorem(numRows).size(); i++) {
            pascalsTriangle.add(binomialTheorem(i));
        }
        //printing whole list of lists
        for (int i = 0; i < pascalsTriangle.size(); i++) {
            for (int j = 0; j < pascalsTriangle.get(i).size(); j++) {
                System.out.print(pascalsTriangle.get(i).get(j) + " ");
            }
            System.out.println();
        }





        return pascalsTriangle;
    }
    //putting numbers in list of a certain level of a triangle
    public static List<Integer> binomialTheorem(int n) {

        List<Integer> numbers = new ArrayList<>();

        int term = 1;
        numbers.add(term);


        for (int i = 1; i <= n; i++) {
            term = term * (n - i + 1) / (i);

            numbers.add(term);

        }
        return numbers;
    }

}
