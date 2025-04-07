import java.util.HashSet;

public class LongestSubstrting {

    // Problem 1
    public static int findLongestSubstring(String s) {
        int maxLength = 0, start = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            while (seen.contains(s.charAt(end))) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";

        System.out.println("Input: abcabcbb, Output: " + findLongestSubstring(input1));
        System.out.println("Input: bbbbb, Output: " + findLongestSubstring(input2));
    }
}
