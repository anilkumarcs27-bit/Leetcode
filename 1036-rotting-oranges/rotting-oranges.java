class Pair{
    int first;
    int second;
    int time;
    Pair(int first, int second, int time){
        this.first = first;
        this.second = second;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int maxtime = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j,0));
                    visited[i][j]=2;
                }
            }
        }
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int ltime = q.peek().time;
            q.poll();
            int[] delrow = {-1,0,1,0};
            int[] delcol = {0,-1,0,1};
            for(int i=0;i<4;i++){
                int nrow = row+delrow[i];
                int ncol = col+delcol[i];
                if(nrow>=0&&ncol>=0&& nrow<n&&ncol<m){
                    if(grid[nrow][ncol]==1 && visited[nrow][ncol]==0){
                        q.offer(new Pair(nrow,ncol, ltime+1));
                        visited[nrow][ncol]=2;
                        maxtime = Math.max(ltime+1, maxtime);
                    }
                }
            }
            
        }
        for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==1 && visited[i][j]==0){
                        return -1;
                    }
                }
            }




        return maxtime;
        
    }
}