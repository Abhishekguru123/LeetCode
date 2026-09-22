class Solution {public int partition(int nums[], int low, int high) {
    int i = low - 1;
    int pivot = nums[high];

    for (int j = low; j < high; j++) {

    
        if (nums[j] > pivot) {
            i++;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    i++;

    int temp = nums[i];
    nums[i] = nums[high];
    nums[high] = temp;

    return i;
}
    public void quicksort(int nums[], int low, int high) {
    if (low < high) {

        int pivotidx = partition(nums, low, high);

        quicksort(nums, low, pivotidx - 1);
        quicksort(nums, pivotidx + 1, high);
    }
}
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,String> map = new HashMap<>();

        int original[]= score.clone();

        int n = score.length-1;

        quicksort(score,0,n);


        for(int i = 0;i<score.length;i++){
           
            if(i==0){
                map.put(score[i],"Gold Medal");
            }
            else if(i==1){
                map.put(score[i],"Silver Medal");
            }
            else if(i==2){
                map.put(score[i],"Bronze Medal");
            }else{
                map.put(score[i],String.valueOf(i+1));
            }
        }

        String ans[] = new String [original.length];
        for(int i =0;i<original.length;i++){
            ans[i]=map.get(original[i]);

        }
        return ans;

        
    }
}