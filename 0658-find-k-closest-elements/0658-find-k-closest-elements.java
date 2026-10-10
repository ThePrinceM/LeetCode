class Solution {

    class dist implements Comparable<dist>{
        int distance;
        int a;
        dist(int a,int distance){
            this.a = a;
            this.distance = distance;
        }

        public int compareTo(dist d){
            if(this.distance == d.distance) return this.a - d.a;
            return this.distance - d.distance;
        }

    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<dist> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> l = new ArrayList<>(k);
        for(int i = 0;i<arr.length; i++){
            int a = arr[i];
            int d = Math.abs(a - x);
            pq.add(new dist(a, d));
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            dist t = pq.poll();
            l.add(t.a);

        }
        Collections.sort(l);
        return l;
    }
}