class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int i = 0, j = n - 1;

        while (colors[i] == colors[j]) {
            j--;
        }
        int maxDist1 = j - i;

        j = n - 1;
        while (colors[i] == colors[j]) {
            i++;
        }
        int maxDist2 = j - i;

        return Math.max(maxDist1, maxDist2);
    }
}
