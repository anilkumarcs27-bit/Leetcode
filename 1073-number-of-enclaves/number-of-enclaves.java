class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||i==n-1||j==0||j==m-1){
                    if(grid[i][j]==1 && visited[i][j]==0){
                        q.offer(new Pair(i,j));
                        visited[i][j]=1;
                    }
                }
            }
        }
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();
            int[] delrow = {0,1,0,-1};
            int[] delcol = {1,0,-1,0};
            for(int i=0;i<4;i++){
                int nrow = row+delrow[i];
                int ncol = col+delcol[i];
                if(nrow>=0 && nrow<n&&ncol>=0&&ncol<m){
                    if(grid[nrow][ncol]==1 && visited[nrow][ncol]==0){
                        q.offer(new Pair(nrow, ncol));
                        visited[nrow][ncol]=1;
                    }
                }
            }

        }
        int count =0;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    count++;
                }
            }
        }
        


    return count;
    }
}