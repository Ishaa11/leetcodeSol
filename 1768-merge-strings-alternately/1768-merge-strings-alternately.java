class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        
        String x = "";
        
        for(int i=0;i<word1.length() || i<word2.length();i++){
            if(i<word1.length()){
                x = x + word1.charAt(i);
            }
            if(i<word2.length()){
                x = x + word2.charAt(i);
            }
        }
        return x;
    }
}