class Solution {
    public String removeDuplicates(String s) {
        ArrayList<Character> chList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chList.add(c);
        }   
        // for(int i=0;i<chList.size()-1;i++){
        //     if(chList.get(i)==chList.get(i+1)){
        //         chList.remove(i);
        //         chList.remove(i+1);
        //     }
        // }
        // String ans=chList.toString();
        // return ans;

        int i=0;
        while(i<chList.size()-1){
            if(chList.get(i).equals(chList.get(i+1))){
                chList.remove(i);
                chList.remove(i);
                if(i>0) i--;
            }else{
                i++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : chList) {
            ans.append(c);
        }
        
        return ans.toString();
    }
}