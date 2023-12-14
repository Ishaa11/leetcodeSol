class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        int num = x,rev=0;
        
        while(num!=0){
            int dig = num%10;
            rev=rev*10+dig;
            num/=10;
        }
        
        return (x==rev);
    }
}