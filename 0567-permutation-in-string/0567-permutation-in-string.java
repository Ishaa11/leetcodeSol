class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s1.length();i++){
            char x = s1.charAt(i);
            arr[x-'a']++;
        }
        
        for(int i=0;i<s2.length();i++){
            char x = s2.charAt(i);
            arr[x-'a']--;
            
            if(i-s1.length() >= 0){
                arr[s2.charAt(i-s1.length())-'a']++;
            }
            if(zero(arr)) {
                return true;
            }
        }
        
        return false;
    }
    public boolean zero(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                return false;
            }
        }
        return true;
    }
}
