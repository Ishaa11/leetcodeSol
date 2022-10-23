class Solution {
    public int missingNumber(int[] nums) {
        
        int sum=0,n=nums.length;
        int exp=n*(n+1)/2;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        return exp-sum;
    }
}