class Solution {
    public int smallestNumber(int n) {
        while (true) {
            String binary = Integer.toBinaryString(n);
            if (!binary.contains("0")) {
                return n;
            }
            n++;
        }
    }
}