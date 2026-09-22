class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        String result="";
        int carry=0;
        
        while(i>=0||j>=0){
            int num1 =0;
        int num2=0;
            if(i>=0){
                num1= a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                num2= b.charAt(j)-'0';
                j--;
            }
            if(num1==0&&num2==0){
                if(carry==0){
                    result='0'+result;
                    carry=0;
                }else{
                    result='1'+result;
                    carry=0;
                }
            }
            if ((num1==0&&num2==1)||(num1==1&&num2==0)){
                if(carry==0){
                    result='1'+result;
                    carry=0;
                }else{
                    result ='0'+result;
                    carry=1;
                }
            }
            else if(num1==1&&num2==1){
                if(carry==0){
                    result='0'+result;
                    carry=1;
                }else{
                    result='1'+result;
                    carry=1;

                }
            }

        }
        if(carry==1){
            result='1'+result;
        }
        return result;
        
    }
}