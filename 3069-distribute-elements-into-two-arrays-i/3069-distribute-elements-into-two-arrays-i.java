class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int[] b=new int[n];
        a[0]=nums[0];
        b[0]=nums[1];
        
        int p = 0, q = 0;
        for(int i = 2; i < n; i++) {
            if(a[p] > b[q]) {
                a[++p] = nums[i];
            }
            else b[++q] = nums[i];
        }

        for(int i = 0; i <= p; i++) {
            nums[i] = a[i];
        }
        int j = p+1;
        for(int i = 0; i <= q; i++) {
            nums[j++] = b[i];
        }

        return nums;
    }
}