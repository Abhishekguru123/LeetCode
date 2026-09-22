class Solution {
    public int romanToInt(String s) {
        
        int n=0;
        int num=0;
        while(n < s.length())
        {
            if(n+1<s.length())
            {
                if(
                ((s.charAt(n)=='I' && s.charAt(n+1)=='V')||(s.charAt(n)=='I' && s.charAt(n+1)=='X'))||
                ((s.charAt(n)=='X' && s.charAt(n+1)=='L')||(s.charAt(n)=='X' && s.charAt(n+1)=='C'))||
                ((s.charAt(n)=='C'&& s.charAt(n+1)=='D')||(s.charAt(n)=='C' && s.charAt(n+1)=='M')))
                {
                 num =num+getValue(s.charAt(n+1))-getValue(s.charAt(n));
                 n=n+2;
                }else
                {
                  num=num + getValue(s.charAt(n));
                  n++;
                }
                           
            }else
                {
                  num=num + getValue(s.charAt(n));
                  n++;
                }

        }
        
        
        return num;


    }
    
    public int getValue(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        return 1000;
    }
    

}