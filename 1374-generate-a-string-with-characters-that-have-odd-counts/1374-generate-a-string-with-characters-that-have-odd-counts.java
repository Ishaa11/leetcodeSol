class Solution {
    public String generateTheString(int n) {
        String s = new String();
        if(n%2!=0){//odd
            for(int i=0;i<n;i++){
                s=s+'a';
            }
        }else{//even
            for(int i=0;i<n-1;i++){
                s=s+'a';
            }
            s=s+'b';
        }
        return s;
    }
}