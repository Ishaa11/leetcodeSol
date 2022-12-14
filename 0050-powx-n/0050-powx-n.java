class Solution {
    public double myPow(double x, int n) {
        if(x == 0)
            return 0;
        if(n == 0)
            return 1;
        
        double p = myPow(x,n/2);
        
        if(n%2 == 0)
            return  p * p;
        else if(n%2 == 1)
            return  p * p * x;
        else
            return 1/myPow(x,-n);
    }
}