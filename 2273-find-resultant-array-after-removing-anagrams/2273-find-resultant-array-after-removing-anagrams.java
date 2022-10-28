class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!isAnagram(words[i-1],words[i])){
                list.add(words[i]);
            }
        }
        return list;
    }
    
     public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
         String s1 = new String(ss);
        
        char[] tt = t.toCharArray();
       Arrays.sort(tt);
         String s2 = new String(tt);
       
        
        return s1.equals(s2);
    }
}