class Pair{
    int first;
    int second;
    int dist;
    Pair(int first, int second, int dist){
        this.first = first;
        this.second = second;
        this.dist = dist;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] grid) {
     int n = grid.length;
     int m = grid[0].length;
     int[][] visited = new int[n][m];
     int[][] distance = new int[n][m];
     Queue<Pair> q= new LinkedList<>();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==0){
                q.offer(new Pair(i,j,0));
                visited[i][j]=1;
            }
        }
    }

    while(!q.isEmpty()){
        int row= q.peek().first;
        int col = q.peek().second;
        int dist = q.peek().dist;
        q.poll();
        int[] delrow = {0,1,0,-1};
        int[] delcol = {-1,0,1,0};
        for(int i=0;i<4;i++){
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];
            if(nrow>=0&&nrow<n&& ncol>=0&&ncol<m){
                if(grid[nrow][ncol]==1 && visited[nrow][ncol]==0){
                    distance[nrow][ncol] = dist+1;
                    visited[nrow][ncol]=1;
                    q.offer(new Pair(nrow, ncol,dist+1));
                }
            }

        }
    }



    return distance;
    }
}