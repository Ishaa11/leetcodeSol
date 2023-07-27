class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for(int i=1;i<nums.length;i++){
            int sum = nums[i]+nums[i-1];
            
            if(seen.contains(sum)){
                return true;
            }
            seen.add(sum);
        }
        
        return false;
    }
}