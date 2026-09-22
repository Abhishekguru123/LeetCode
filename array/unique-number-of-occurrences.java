class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int value=1;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+value);
            }else{
            map.put(arr[i], value);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : map.values()){
            set.add(i);
        }
       

        return set.size()==map.size();
        
    }
}