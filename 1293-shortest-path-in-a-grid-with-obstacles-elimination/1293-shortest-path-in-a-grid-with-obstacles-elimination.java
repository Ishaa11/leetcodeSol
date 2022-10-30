class Solution {
    int[][] dir = new int[][]{{0,-1}, {-1,0}, {0,1},{1,0}};

public int shortestPath(int[][] grid, int k) {

    if( grid.length == 1 && grid[0].length == 1 ) return 0;
    
    Queue<int[]> q = new LinkedList<>();
    
    q.add(new int[]{0,0,k});
    
    boolean[][][] visited = new boolean[grid.length][grid[0].length][k+1];
    
    int result = 0;
    
    while( !q.isEmpty() ){
        int size = q.size();
        result++;
        while( size--> 0 ){
            
            int[] c = q.poll();                
            
            if( visited[c[0]][c[1]][c[2]]  ) continue;
            visited[c[0]][c[1]][c[2]] = true;
            
            for( int[] d : dir ){
                int newX = c[0]+d[0];
                int newY = c[1]+d[1];
                
                if( newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length 
                  || ( grid[newX][newY] == 1 && c[2] == 0) ) continue;
                

                if( newX == grid.length-1 && newY == grid[0].length-1  ) return result;

                int newK = grid[newX][newY] == 1 ? c[2]-1 : c[2];
                
                q.offer(new int[]{newX, newY, newK});
                
            }
        }
    }
    
    return -1;
}
}