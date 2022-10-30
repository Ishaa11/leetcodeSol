class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count=0,cursum=0;
        
        for(int i=0;i<nums.length;i++){
            //cursum=nums[i];
            for(int j=i;j<nums.length;j++){
                cursum+=nums[j];
                if(cursum==k){
                    count++;
                }
            }
            cursum=0;
        }
        return count;
    }
}