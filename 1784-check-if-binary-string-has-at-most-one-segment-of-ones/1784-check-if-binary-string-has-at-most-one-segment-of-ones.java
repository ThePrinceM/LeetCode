class Solution {
    public boolean checkOnesSegment(String s) {
        char[] ch = s.toCharArray();
        boolean flag = true;
        int left = 0, right = 0;

        while (right < ch.length) {
            if (left == right) {
                right++;
                
            }
            if (right < ch.length && ch[right] == '0') {
                left = right;
                right++;
                if (right < ch.length && ch[right] == '1') {
                    flag = false;
                    break;
                }
            } else {
                right++;
            }
        }
        return flag;
    }
}