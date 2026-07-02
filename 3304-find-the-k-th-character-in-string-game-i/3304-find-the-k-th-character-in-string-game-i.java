class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                char nc = (c == 'z') ? 'a' : (char)(c + 1);
                next.append(nc);
            }
            word.append(next);
        }
        return word.charAt(k - 1);
    }
}
