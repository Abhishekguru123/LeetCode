class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
       int  reversenumber=0;
        int digits=0;
        if(num<0){
            return false;
        }else{
            while(num!=0){
                digits=num%10;
                reversenumber=(reversenumber*10)+digits;
                num=num/10;
            }
            if(x==reversenumber){
                return true;
            }
            else{
                return false;
            }
            
        }
    }
}