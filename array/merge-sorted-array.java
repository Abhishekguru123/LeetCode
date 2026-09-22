class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result= new int[m+n];
        int position = 0;
        
        // 4. Copy first array
        for (int i = 0; i < m; i++) {
            result[position] = nums1[i];
            position++;
        }
        
        // 5. Copy second array
        for (int i = 0; i < n; i++) {
            result[position] = nums2[i];
            position++;
        }

        

        for(int i=0;i<result.length;i++){
            for (int j =0;j<result.length;j++){

                if(result[i]<result[j]){
                    int temp= result[i];
                    result[i]=result[j];
                    result[j]=temp;
                }
            
            }
        }
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
        

        
    }
}