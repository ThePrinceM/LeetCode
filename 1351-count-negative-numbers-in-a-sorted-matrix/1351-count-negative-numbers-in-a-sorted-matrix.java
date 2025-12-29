class Solution {
    public int countNegatives(int[][] grid) {
        int rl=grid.length;
        int cl=grid[0].length;
        int count=0;
        int i=0,j=cl-1;
        while(i<rl && j>=0){
            if(grid[i][j]<0) {
                count+=rl-i;
                j--;
            }else i++;
        }
        return count;
    }
}