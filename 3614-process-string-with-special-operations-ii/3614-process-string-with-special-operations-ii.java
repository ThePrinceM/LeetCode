class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        final long INF = (long)1e18; // safe cap > 1e15
        long[] len = new long[n];
        
        // forward pass: compute lengths after each operation
        for (int i = 0; i < n; ++i) {
            char c = s.charAt(i);
            if (i == 0) {
                if (c == '*') len[i] = 0;
                else if (c == '#') len[i] = 0; // duplicate empty -> empty
                else if (c == '%') len[i] = 0; // reverse empty -> empty
                else len[i] = 1; // letter
            } else {
                long prev = len[i-1];
                if (c == '*') {
                    if (prev > 0) len[i] = prev - 1;
                    else len[i] = 0;
                } else if (c == '#') {
                    long doubled = prev;
                    if (doubled > INF - prev) len[i] = INF;
                    else doubled = prev + prev;
                    len[i] = Math.min(doubled, INF);
                } else if (c == '%') {
                    len[i] = prev;
                } else { // letter
                    len[i] = Math.min(prev + 1, INF);
                }
            }
        }
        
        long total = n == 0 ? 0 : len[n-1];
        if (k < 0 || k >= total) return '.';
        
        // backtrack to find the character at index k
        for (int i = n - 1; i >= 0; --i) {
            char c = s.charAt(i);
            long prev = (i > 0) ? len[i-1] : 0;
            
            if (c == '*') {
            } else if (c == '#') {
                // duplication: len[i] = prev * 2 (possibly capped)
                if (prev == 0) {
                    // duplication of empty -> still empty, nothing changes
                } else {
                    if (k >= prev) {
                        k = k - prev;
                    } // else k stays same (first half)
                }
            } else if (c == '%') {
                // reverse: index maps to prev-1 - k
                if (prev > 0) {
                    k = prev - 1 - k;
                } // else nothing
            } else {
                if (k == prev) {
                    return c;
                }
            }
        }
        return '.';
    }
}
