class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        // Get the length of the circular array
        int n = words.length;
    
        // Start with the largest possible distance.
        // Any real distance will be smaller, so the first update will work.
        int minDist = Integer.MAX_VALUE;
        
        // Scan every index in the array
        for (int i = 0; i < n; i++) {
            // Check if the current word matches the target
            if (words[i].equals(target)) {  
                // Direct linear distance (no wrap)
                int direct = Math.abs(startIndex - i);
                // Distance going the other way around the circle
                int wrapAround = n - direct;
                // The true circular distance is the shorter of the two
                int res = Math.min(direct, wrapAround);
                // Keep the smallest distance found so far
                minDist = Math.min(minDist, res);
           }
        }
        
        // If minDist was never updated, target is not in words → return -1
        // Otherwise return the shortest distance
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}