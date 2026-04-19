class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int maxDist = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                // Valid pair found, record distance and push j further
                maxDist = Math.max(maxDist, j - i);
                j++;
            } else {
                // nums1[i] too large for current j, advance i
                // Also advance j to maintain i <= j
                i++;
                if (j < i) j = i;
            }
        }

        return maxDist;
    }
}