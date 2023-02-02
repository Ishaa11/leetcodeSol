class Solution {
    private boolean check(String word1, String word2 ,Map<Character,Integer> ma){
        int len1= word1.length();
        int len2= word2.length();
        int min = Math.min(len1,len2);
        for(int i=0;i<min;i++){
            if(ma.get(word1.charAt(i))>ma.get(word2.charAt(i))){
                return false;
            }
             if(ma.get(word1.charAt(i))<ma.get(word2.charAt(i))){
                return true;
            }
        }
        if(len2 < len1){
            return false;
        }
        return true;   
    }
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> ma= new HashMap<Character,Integer>(26);
        for(int i=0;i<order.length();i++){
            ma.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++){
            if(!check(words[i],words[i+1],ma)){
                return false;
            }
        }
        return true; 
    }
}

 