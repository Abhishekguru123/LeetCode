class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }

        int latestprev=3;

       int  prev= 2;
       int result=0;
        for(int i=4;i<=n;i++){
            result = latestprev+prev;
           prev = latestprev;
            latestprev = result;


        }
        return result;
    }
}