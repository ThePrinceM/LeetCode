class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> san=new LinkedList<>();
        Queue<Integer> stu=new LinkedList<>();
        int n=sandwiches.length;
        int i=0;
        while(n>i ){
            san.add(sandwiches[i]);
            i++;
        }
        i = 0;
        while (i < n) {
            stu.add(students[i]);
            i++;
        }
        while (!san.isEmpty()) {
            int rotations = 0;
            int maxRotations = stu.size();
            boolean eaten = false;

            // try at most 'maxRotations' students for the current top sandwich
            while (rotations < maxRotations) {
                if (stu.peek().intValue() == san.peek().intValue()) {
                    // student takes sandwich
                    stu.poll();
                    san.poll();
                    eaten = true;
                    break;
                } else {
                    // rotate student to back
                    stu.add(stu.poll());
                    rotations++;
                }
            }

            // if nobody ate this sandwich, remaining students cannot eat
            if (!eaten) break;
        }

        return stu.size();
        
    }
}