class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0; 

        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            int sum = 0;
            for (int j = 1; j <= nums[i]/2; j++) {
                if (nums[i] % j == 0 ) {
                    al.add(j);
                    if(al.size()>3) break;
                }
            }
            al.add(nums[i]);

            if (al.size() == 4) {
                for (int ele : al) {
                    sum += ele;
                }
                totalSum += sum;
            }
        }

        return totalSum;
    }
}