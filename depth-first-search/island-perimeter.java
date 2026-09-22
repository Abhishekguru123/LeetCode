class Solution {
    public int islandPerimeter(int[][] grid) {
        int count =0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                    //up
                    if(row>0&&grid[row-1][col]==0||row==0){
                        count++;
                    }
                    //down
                    if(row<grid.length-1 && grid[row+1][col]==0||row==grid.length-1){
                        count++;
                    }
                    //left
                    if(col>0&& grid[row][col-1]==0||col==0){
                        count++;
                    }
                    //right
                    if(col<grid[0].length-1&& grid[row][col+1]==0||col==grid[0].length-1){
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
}