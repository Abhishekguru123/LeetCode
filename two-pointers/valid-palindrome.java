class Solution {
    public boolean isPalindrome(String s) {
        String S1=s.toLowerCase();
        String clean=  S1.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder result =new StringBuilder();

        for(int i =clean.length()-1;i>-1;i--){
            
                result.append(clean.charAt(i));
            
        }
        if(result.toString().equals(clean)){
            return true;
        }else{
            return false;
        }



        
    }
}