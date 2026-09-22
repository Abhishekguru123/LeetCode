class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result =strs[0];
        for(int j=1;j<strs.length;j++){
            String second=strs[j];
            int i=0;
            
           while (i < result.length() &&
                   i < second.length() &&
                   result.charAt(i) == second.charAt(i)) {

                i++;
            }

            result = result.substring(0, i);
        }
         return result;
        
           
           
           
            
           
        
       
    
    }
     
    }
