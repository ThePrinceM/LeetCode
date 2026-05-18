import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int x : nums) {
            ArrayList<Integer> temp = new ArrayList<>();
            while (x > 0) {
                temp.add(x % 10);  // collect digits in reverse
                x /= 10;
            }
            // reverse temp to restore correct order
            for (int i = temp.size() - 1; i >= 0; i--) {
                list.add(temp.get(i));
            }
        }
        
        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}
