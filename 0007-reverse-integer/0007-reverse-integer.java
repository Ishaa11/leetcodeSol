class Solution {
    public int reverse(int x) {
        int N = Math.abs(x);
    int rev = 0;
    while(N!=0)
    {
        int digit = N%10;
        
        if((rev > Integer.MAX_VALUE / 10) || (rev < Integer.MIN_VALUE / 10)){ 
        return 0;
        }
        rev = rev*10+digit;
        N = N/10;
    }
        
        return rev=(x>0)?rev:rev*(-1);
    }
}