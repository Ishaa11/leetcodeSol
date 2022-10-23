class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] arr = new int[nums.length+1];
        int dup=0,miss=0;
        
        for(int i : nums) arr[i]++;
        
        for(int i=1;i<arr.length;i++){
           if(arr[i]>1) dup=i;
            if(arr[i]==0) miss=i;
            if(dup!=0 && miss!=0) break;
        }
        
        return new int[] {dup,miss};
    }
}