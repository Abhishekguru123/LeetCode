class Solution {

    public int partition(int nums[],int low, int high){
        int i= low-1;
    int pivot= nums[high];
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp  = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            
        }
          i++;
                int temp  = nums[i];
                nums[i]=pivot;
                nums[high]=temp;
                return i;
    }
    public void quicksort(int nums[], int low,  int high){
        if(low<high){
            int pivotidx= partition(nums,low,high);
            quicksort(nums,low,pivotidx-1);
            quicksort(nums,pivotidx+1, high);
        }
    }


    public int missingNumber(int[] nums) {

        int n= nums.length;

        quicksort(nums,0, n-1);
        int value=0;
        for(int a= 0;a<nums.length;a++){
            if(nums[a]!=value){
               break;
            }value++;
            
        }
        return value;
        

        
    }
}