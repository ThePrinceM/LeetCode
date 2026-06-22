class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char c : s.toCharArray()) countS[c - 'a']++;
        for (char c : target.toCharArray()) countT[c - 'a']++;

        int maxCopies = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (countT[i] > 0) {
                maxCopies = Math.min(maxCopies, countS[i] / countT[i]);
            }
        }

        return maxCopies == Integer.MAX_VALUE ? 0 : maxCopies;
    }
}