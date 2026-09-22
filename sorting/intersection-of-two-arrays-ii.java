class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freqarr= new int[1001];
        for(int num:nums1){
            freqarr[num]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums2){
            if(freqarr[num]>0){
                list.add(num);
                freqarr[num]--;
            }
        }
        int size= list.size();
        int res[]= new int[size];
        for(int i=0;i<size;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}