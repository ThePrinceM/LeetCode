class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int i=0,j=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.get(nums[j])>k){

                map.put(nums[i],map.get(nums[i])-1);
                //if(map.get(nums[p])==0) map.remove(nums[p]);
                i++;
            }

            count=Math.max(count,j-i+1);
            j++;
        }
        return count;
    }
}