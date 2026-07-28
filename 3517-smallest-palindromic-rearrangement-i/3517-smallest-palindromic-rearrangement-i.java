import java.util.*;

class Solution {
    public String smallestPalindrome(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

        for (char c : map.keySet()) {
            int count = map.get(c);

            // Add half of the characters to the left side
            for (int i = 0; i < count / 2; i++) {
                left.append(c);
            }

            // If odd count, one goes to the middle
            if (count % 2 == 1 && middle.isEmpty()) {
                middle = String.valueOf(c);
            }
        }

        // Build palindrome: left + middle + reverse(left)
        String right = new StringBuilder(left).reverse().toString();
        return left.toString() + middle + right;
    }
}
