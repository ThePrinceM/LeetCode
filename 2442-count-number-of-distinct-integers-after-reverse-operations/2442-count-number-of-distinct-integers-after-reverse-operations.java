class Solution {
    public int countDistinctIntegers(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            int reversed = 0;
            int num = arr[i];
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }  
            set.add(reversed);      
        }
        return set.size();
    }
}