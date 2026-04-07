class Solution {
    public int numIslands(char[][] grid) {
        int totalLands = 0;
        for(int row = 0; row < grid.length; row++){
           for(int column = 0; column < grid[0].length; column++){
                if (grid[row][column] == '1'){
                    mapConnectedLands(grid,row,column);
                    totalLands++;
                }
           }
        }
        return totalLands;
    }

    public void mapConnectedLands(char[][] grid,Integer row, Integer column){
        if (Math.min(row, column) < 0 || row == grid.length || column == grid[0].length){
            return;
        }
        if (grid[row][column] == '0'){
            return;
        }
        grid[row][column] = '0';
        mapConnectedLands(grid,row + 1,column);
        mapConnectedLands(grid,row - 1,column);
        mapConnectedLands(grid,row ,column + 1);
        mapConnectedLands(grid,row,column - 1);
    }


}
