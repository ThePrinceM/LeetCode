class Solution {
    public int searchInsert(int[] nums, int tg) {
        int n = nums.length;
        int lo = 0, hi = n-1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(nums[mid] == tg){
                return mid;
            }else if( nums[mid] < tg){
                lo = mid + 1;
            }else hi = mid - 1;
        }
        return lo;
    }
}