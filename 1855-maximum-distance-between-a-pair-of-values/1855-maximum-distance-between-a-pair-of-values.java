// class Solution {
//     public int maxDistance(int[] nums1, int[] nums2) {
//         int i = 0, j = 0;
//         int maxDist = 0;

//         while (i < nums1.length && j < nums2.length) {
//             if (nums1[i] <= nums2[j]) {
//                 // Valid pair found, record distance and push j further
//                 maxDist = Math.max(maxDist, j - i);
//                 j++;
//             } else {
//                 // nums1[i] too large for current j, advance i
//                 // Also advance j to maintain i <= j
//                 i++;
//                 if (j < i) j = i;
//             }
//         }

//         return maxDist;
//     }
// }

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDist = 0;

        for (int i = 0; i < nums1.length; i++) {
            // Find the rightmost j >= i where nums2[j] >= nums1[i]
            int lo = i, hi = nums2.length - 1;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums2[mid] >= nums1[i]) {
                    lo = mid + 1; // try to go further right
                } else {
                    hi = mid - 1;
                }
            }

            // hi is now the rightmost valid j
            maxDist = Math.max(maxDist, hi - i);
        }

        return maxDist;
    }
}