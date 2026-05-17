class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int x : nums) if (x > max) max = x;

        // candidate n must equal max, and array length must be max + 1
        if (n != max + 1) return false;

        boolean[] seen = new boolean[max + 1]; // index 0 unused
        int countMax = 0;

        for (int x : nums) {
            if (x < 1 || x > max) return false;
            if (x == max) {
                countMax++;
            } else {
                if (seen[x]) return false;
                seen[x] = true;
            }
        }

        if (countMax != 2) return false;

        for (int i = 1; i <= max - 1; i++) {
            if (!seen[i]) return false;
        }

        return true;
    }
}
