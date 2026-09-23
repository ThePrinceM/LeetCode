class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //largest therefore min heap
        int n = nums.length;
        for(int e: nums){
            pq.add(e);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}