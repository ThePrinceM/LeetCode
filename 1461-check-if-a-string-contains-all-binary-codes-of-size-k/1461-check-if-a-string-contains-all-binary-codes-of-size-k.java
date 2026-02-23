// class Solution {
//     public boolean hasAllCodes(String s, int k) {
//         ArrayList<String> substring=new ArrayList<>();
//         int count=0;
//         for(int i=0;i<(int)Math.pow(2,k);i++){
//             String bin = String.format("%"+k+"s", Integer.toBinaryString(i)).replace(' ', '0');
//             substring.add(bin);
//         }
//         for(int i=0;i<substring.size();i++){
//             if(s.contains(substring.get(i))) count++;
//             else return false;
//         }
//         return count==substring.size();
//     }
// }

class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            seen.add(s.substring(i, i + k));
        }
        return seen.size() == (1 << k);
    }
}