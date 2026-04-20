class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int i = 0, j = n - 1;

        // First, check from the leftmost house to the rightmost different color
        while (colors[i] == colors[j]) {
            j--;
        }
        int maxDist1 = j - i;

        // Then, check from the rightmost house to the leftmost different color
        j = n - 1;
        while (colors[i] == colors[j]) {
            i++;
        }
        int maxDist2 = j - i;

        return Math.max(maxDist1, maxDist2);
    }
}
