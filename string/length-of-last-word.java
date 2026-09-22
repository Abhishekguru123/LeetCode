class Solution {
    public int lengthOfLastWord(String s) {
        String newstring = s.trim();
        int i = newstring.length()-1;
        int count=0;
        if(newstring.isEmpty()){
            return 0;
        }
        while(i>=0&&newstring.charAt(i)!=' '){
            count+=1;
            i--;
        }
        return  count;

        
    }
}