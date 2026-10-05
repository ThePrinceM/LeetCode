class Solution {
    public class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(int d, int x, int y){
            this.d = d;
            this.x = x;
            this.y = y;
        }

        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[][] ans = new int[k][2];
        int n = points.length;
        for(int i = 0; i < n; i++){
            int x = points[i][0];
            int y = points[i][1];
            int d = x*x + y*y;
            pq.add(new Triplet(d, x, y));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int idx = 0;
        while(!pq.isEmpty() ){
            Triplet t = pq.poll();
            ans[idx][0] = t.x;
            ans[idx++][1] = t.y;
        }
        return ans;
    }
}