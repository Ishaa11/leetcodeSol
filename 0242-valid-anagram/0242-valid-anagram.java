class Solution {
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