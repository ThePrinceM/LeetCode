class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = text.toCharArray();
        
        // Count only balloon characters
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='b' || ch[i]=='a' || ch[i]=='l' || ch[i]=='o' || ch[i]=='n'){
                map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
            }
        }

        // If any required character is missing, return 0
        if(!map.containsKey('b') || !map.containsKey('a') || 
           !map.containsKey('l') || !map.containsKey('o') || 
           !map.containsKey('n')) {
            return 0;
        }

        // Adjust counts for characters that appear more than once in "balloon"
        int b = map.get('b');
        int a = map.get('a');
        int l = map.get('l') / 2;  // needs 2
        int o = map.get('o') / 2;  // needs 2
        int n = map.get('n');

        // The limiting factor is the minimum of these
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}
