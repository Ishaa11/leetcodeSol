class Solution {
    public char repeatedCharacter(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        char ch = 'a';
        
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(map.containsKey(ch)){
                return ch;
            }else{
                map.put(ch,1);
            }
        }
        
        return ch;
    }
}