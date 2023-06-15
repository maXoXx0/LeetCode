import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int j = 0;
        int i = 0;
        int longest = 0;

        HashSet<Character> set = new HashSet<>();

        while (j < s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                longest = Math.max(longest, set.size());
            }else{
                set.remove(s.charAt(i++));
            }
        }

        return longest;
    }
}
