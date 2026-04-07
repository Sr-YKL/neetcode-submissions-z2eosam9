class Solution {
    public int numIslands(char[][] grid) {
        Map<Coordinate, Boolean> set = new HashMap<>();
        int totalLands = 0;
        for(int row = 0; row < grid.length; row++){
           for(int column = 0; column < grid[0].length; column++){
                if (grid[row][column] == '1' && !set.containsKey(new Coordinate(row, column))){
                    mapConnectedLands(grid,row,column,set);
                    totalLands++;
                }
           }
        }
        return totalLands;
    }

    public void mapConnectedLands(char[][] grid,Integer row, Integer column,Map<Coordinate, Boolean> set){
        if (Math.min(row, column) < 0 || row == grid.length || column == grid[0].length || set.containsKey(new Coordinate(row, column))){
            return;
        }
        if (grid[row][column] == '0'){
            return;
        }
        set.put(new Coordinate(row,column),true);
        mapConnectedLands(grid,row + 1,column,set);
        mapConnectedLands(grid,row - 1,column,set);
        mapConnectedLands(grid,row ,column + 1,set);
        mapConnectedLands(grid,row,column - 1 ,set);
    }

    public record Coordinate(Integer row, Integer column){};
}
