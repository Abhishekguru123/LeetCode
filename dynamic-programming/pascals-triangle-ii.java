import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        int layer =0;
        
        while( layer <= rowIndex){

            List<Integer> nums=new ArrayList<>();

            
            nums.add(1);
            if(layer >1){
                for(int i =0;i<layer-1;i++){
                    List<Integer> previous=result.get(layer-1);
                nums.add(previous.get(i)+previous.get(i+1));
                }
                

                
             }
             if(layer>0){
                nums.add(1);
             }
             result.add(nums);
             layer++;
        }
        return result.get(rowIndex);
        
    }
}