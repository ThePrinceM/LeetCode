class Solution {
    public static int minFlips(String s) {
        int n = s.length();
        
        int m1 = 0; // mismatches for "0101..."
        int m2 = 0; // mismatches for "1010..."
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            char e1 = (i % 2 == 0) ? '0' : '1';
            char e2 = (i % 2 == 0) ? '1' : '0';
            
            if (c != e1) m1++;
            if (c != e2) m2++;
        }
        
        int res = Math.min(m1, m2);
        
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                
                if (c != ((i % 2 == 0) ? '0' : '1')) m1--;
                if (c != ((i % 2 == 0) ? '1' : '0')) m2--;
                
                if (c != (((i + n) % 2 == 0) ? '0' : '1')) m1++;
                if (c != (((i + n) % 2 == 0) ? '1' : '0')) m2++;
                
                res = Math.min(res, Math.min(m1, m2));
            }
        }
        
        return res;
    }
}