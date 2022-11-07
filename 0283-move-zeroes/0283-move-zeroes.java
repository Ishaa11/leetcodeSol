class Solution {
    public void moveZeroes(int[] nums) {
        int[] a = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length && j<a.length;i++){
            if(nums[i]!=0){
                a[j]=nums[i];
                j++;
            }
        }
        
        for(int i=j;i<a.length;i++){
            a[i]=0;
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i]=a[i];
        }
    }
}