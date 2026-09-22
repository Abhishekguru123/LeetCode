class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=0;
        for(int i=0;i<nums.length;i++){
           
                if(nums[i]==target){
                    result =i;
                }
                else if(target>nums[i]&& i==nums.length-1){
                    result=i+1;
                }
                else if(target>nums[i]&&target<nums[i+1]){
                    result=i+1;
                }

           
        }
        
        return result;
    }
}