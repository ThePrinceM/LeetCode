class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        boolean negative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);  // collect remainder
            num /= 7;            // reduce
        }

        if (negative) sb.append('-');

        return sb.reverse().toString();  // reverse since remainders are in reverse order
    }
}