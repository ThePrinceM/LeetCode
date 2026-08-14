class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int maxLen = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            // Shrink window if any character count exceeds 2
            while (map.get(c) > 2) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
