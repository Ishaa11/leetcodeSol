class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map = new HashMap<>();
        
        String[] s1 = s.split(" ");  
        
        if (s1.length != pattern.length())
            return false;
        
        for(int i=0;i<s1.length;i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                
                if(!map.get(ch).equals(s1[i])) 
                    return false;
            }else{
                if(map.containsValue(s1[i])) 
                    return false;
                map.put(ch,s1[i]);
            }
        }
        
        return true;
    }
}
