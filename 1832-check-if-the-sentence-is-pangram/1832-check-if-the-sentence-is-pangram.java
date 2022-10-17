class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean[] alpha = new boolean[26];
        
        for(int i=0;i<sentence.length();i++){
            
            alpha[sentence.charAt(i)-'a']=true;
            
        }
        
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]==false) return false;
        }
        
        return true;
    }
}