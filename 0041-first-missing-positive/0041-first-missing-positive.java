public class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        // int[] brr = new int[n];

        // // Step1: Mark presence of values in arr
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > 0 && arr[i] <= n) {
        //         brr[arr[i] - 1] = -1; // mark the position as present
        //     }
        // }

        // // Step2: Find the first index not marked
        // for (int i = 0; i < n; i++) {
        //     if (brr[i] != -1) {
        //         return i + 1; // i + 1 is the missing positive
        //     }
        // }

        // // Step3: If all positions are marked, return n + 1
        // return n + 1;

        Set<Integer> set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }

        for(int i=1;i<n+1;i++){
            if(!set.contains(i)) return i;
        }
        return n+1;
    }
}