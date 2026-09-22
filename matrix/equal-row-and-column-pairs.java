class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List, Integer> map = new HashMap<>();
        int[] nums= new int[grid.length];
        int count= 0;
        for(int i =0;i<nums.length;i++) {
            List<Integer> temp= new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                temp.add(grid[i][j]);
            }
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }  
        for(int i= 0;i<grid.length;i++){
            List<Integer> temp= new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                temp.add(grid[j][i]);
            }
            if(map.containsKey(temp)){
                count =count+ map.get(temp);
            }
        }
        return count;

    }
}