// class Solution {
//     public int totalMoney(int n) {
//         int[] total=new int[n+1];
//         for(int i=1;i<=n;i++){
//             if(i%7==1){
//                 total[i]=total[i-1]+1;
//             }else if(i!=1 && i%8!=0){
//                 total[i]=total[i-1]+1;
//             }
//         }
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum+=total[i];
//         }
//         return sum;
//     }
// }
class Solution {
    public int totalMoney(int n) {
        int[] total = new int[n + 1];
        total[1] = 1; // First Monday starts with 1

        for (int i = 2; i <= n; i++) {
            if (i % 7 == 1) {
                total[i]= total[i-7] + 1;
            } else {
                total[i]=total[i-1] + 1;
            }
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=total[i];
        }

        return sum;
    }
}
