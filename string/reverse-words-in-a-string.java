class Solution {
    public String reverseWords(String s) {
        String reverse= new StringBuilder(s).reverse().toString();
        String newstring= "";
        ArrayList<String> list= new ArrayList<>();
        int i =0;
        while(i<reverse.length()){
            if(reverse.charAt(i)==' '){
                if (!newstring.isEmpty()) {
                 String reversed = new StringBuilder(newstring).reverse().toString();
                 list.add(reversed);
                 newstring="";

            }
            i++;
                
                

            }else{
                newstring+=reverse.charAt(i);
                i++;

            }
        }

         if (!newstring.isEmpty()) {
            String reversed = new StringBuilder(newstring)
                    .reverse()
                    .toString();

            list.add(reversed);
        }
        String result = String.join(" ", list);
        return result;
    }
}