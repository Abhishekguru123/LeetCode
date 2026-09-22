class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h1= new HashMap();
        HashMap<Character,Integer> h2 =new HashMap();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i= 0;i<s.length();i++){
            if(h1.containsKey(s.charAt(i))){
    h1.put(s.charAt(i), h1.get(s.charAt(i)) + 1);
} else {
    h1.put(s.charAt(i), 1);
}

if(h2.containsKey(t.charAt(i))){
    h2.put(t.charAt(i), h2.get(t.charAt(i)) + 1);
} else {
    h2.put(t.charAt(i), 1);
}
        }
        for(char key: h1.keySet()){
            if(h2.containsKey(key)){
                if(!h1.get(key).equals(h2.get(key))){
                    return false;
                }
            }else{
                return false;
            }
        }
        
    
        return true;
        
    }
}