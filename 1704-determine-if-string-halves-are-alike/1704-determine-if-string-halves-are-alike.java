class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length(),count1=0,count2=0;
        String a = s.substring(0,len/2);
        String b = s.substring(len/2);
        
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
        map.put('A',0);
        map.put('E',0);
        map.put('I',0);
        map.put('O',0);
        map.put('U',0);
        
        for(int i=0;i<len/2;i++){
            char z = a.charAt(i);
            if(map.containsKey(z)){
                count1++;
            }
        }
        
        for(int i=0;i<len/2;i++){
            char y = b.charAt(i);
            if(map.containsKey(y)){
                count2++;
            }
        }
        
        return count1==count2;
    }
}