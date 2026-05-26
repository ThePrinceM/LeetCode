class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        // build frequency map for every character (keeps your original style)
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int special = 0;
        // iterate letters 'a' to 'z' and check both cases
        for (char ch = 'a'; ch <= 'z'; ch++) {
            char lower = ch;
            char upper = Character.toUpperCase(ch);
            if (map.getOrDefault(lower, 0) > 0 && map.getOrDefault(upper, 0) > 0) {
                special++;
            }
        }
        return special;
    }
}