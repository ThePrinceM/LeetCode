class Solution {
    public int finalValueAfterOperations(String[] opern) {
        int ans=0;
        for(String key:opern){
            if(key.equals("++X")){
                ans+=1;
            }else if(key.equals("X++")){
                ans+=1;
            }else if(key.equals("--X")){
                ans-=1;
            }else{
                ans-=1;
            }
        }
        return ans;
    }
}