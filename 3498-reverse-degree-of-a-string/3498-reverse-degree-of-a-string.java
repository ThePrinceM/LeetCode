class Solution {
    public int reverseDegree(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (123 - c[i]) * (i + 1);
        }
        return sum;
    }
}