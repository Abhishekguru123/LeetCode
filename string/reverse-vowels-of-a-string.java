class Solution {
     private boolean isVowel(char c) {
        return c == 'a' || c == 'A' ||
               c == 'e' || c == 'E' ||
               c == 'i' || c == 'I' ||
               c == 'o' || c == 'O' ||
               c == 'u' || c == 'U';
    }
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        int left = 0;
        int right= arr.length-1;
        while(left<right){
            
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                 char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
         return new String(arr);
        
    }
}