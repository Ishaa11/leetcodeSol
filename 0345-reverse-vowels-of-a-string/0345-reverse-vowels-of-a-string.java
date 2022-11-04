class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u' || sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I' || sb.charAt(i)=='O' || sb.charAt(i)=='U'){
               str.append(sb.charAt(i));
            }
        }
        
        str.reverse();
        
        for(int i=0,j=0;i<sb.length() && j<str.length();i++){
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u' || sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I' || sb.charAt(i)=='O' || sb.charAt(i)=='U'){
                sb.setCharAt(i,str.charAt(j));
                j++;
            }
        }
        
        return sb.toString();
    }
   
}