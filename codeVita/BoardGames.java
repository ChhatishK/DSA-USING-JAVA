import java.util.*;

class BoardGames {
  static class Cell {
    int x, y, steps;
    
    public Cell(int x, int y, int steps) {
      this.x = x;
      this.y = y;
      this.steps = steps;
    }
  }
  public static void  main(String args[]) {
    Scanner scan = new Scanner(System.in);
    
    int m = scan.nextInt();
    int n = scan.nextInt();
    int [][]grid = new int[m][n];
    
    for (int i=0; i<m; i++) {
      for (int j=0; j<n; j++) {
        grid[i][j] = scan.nextInt();
      }
    }
    
    int sourceX = scan.nextInt();
    int sourceY = scan.nextInt();
    int destX = scan.nextInt();
    int destY = scan.nextInt();
    
    int moveX = scan.nextInt();
    int moveY = scan.nextInt();
    
    
    System.out.println(minMoves(grid, m, n, sourceX, sourceY, destX, destY, moveX, moveY));
    
  }
  
  public static int minMoves(int [][] grid, int m, int n, int startX, int startY, int destX, int destY, int moveX, int moveY) {
    int []dx = {moveX, moveY, -moveY, -moveY};
    int []dy = {moveY, -moveX, moveX, -moveY};
    
    boolean[][] visited = new boolean[m][n];
    Queue<Cell> q = new LinkedList<>();
    
    q.add(new Cell(startX, startY, 0));
    
    visited[startX][startY] = true;
    
    while (!q.isEmpty()) {
      Cell curr = q.poll();
      
      if (curr.x == destX && curr.y == destY) {
        return curr.steps;
      }
      
      for (int i=0; i<4; i++) {
        int newX = curr.x + dx[i];
        int newY = curr.y + dy[i];
        
        if (isValid(newX, newY, m, n, grid, visited)) {
          visited[newX][newY] = true;
          q.add(new Cell(newX, newY, curr.steps+1));
        }
      }
    }
    return -1;
  }
  
  public static boolean isValid(int x, int y, int m, int n, int [][]grid, boolean [][]visited) {
    return x >= 0 && x < m && y >=0 && y < n && grid[x][y] == 0 && !visited[x][y];
  }
}
