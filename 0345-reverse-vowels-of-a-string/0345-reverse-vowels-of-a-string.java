class Solution {
    public String reverseVowels(String s) {
        String str = "";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                str=str+s.charAt(i);
            }
        }
        
        char[] arr = s.toCharArray();
        char[] vow = str.toCharArray();
        
        reverse(vow);
        
        for(int i=0,j=0;i<arr.length && j<vow.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                arr[i]=vow[j];
                j++;
            }
        }
        String string = new String(arr);
        return string;
    }
    
    public void reverse(char a[])
    {
        int n=a.length;
        for (int i = 0; i < n / 2; i++) {
           char t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    } 
}