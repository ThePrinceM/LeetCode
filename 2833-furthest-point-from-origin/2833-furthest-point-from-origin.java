class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int countL=0;
        int countR=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L') countL++;
            else if(moves.charAt(i)=='R') countR++;
        }
        for(int i=0;i<n;i++){
            if(countL<=countR){
                if(moves.charAt(i)=='_') count++;
                else{
                    if(moves.charAt(i)=='L') count--;
                    else if(moves.charAt(i)=='R' || moves.charAt(i)=='_')count++;
                }
            }else{
                if(moves.charAt(i)=='_') count--;
                else{
                    if(moves.charAt(i)=='L') count--;
                    else if(moves.charAt(i)=='R' || moves.charAt(i)=='_')count++;
                }
            }
        }
        return Math.abs(count);
    }
}
