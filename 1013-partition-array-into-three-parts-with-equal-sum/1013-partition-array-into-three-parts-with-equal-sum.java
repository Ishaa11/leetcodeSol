class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int sum=0;
        
        for(int i : arr)
            sum+=i;
        
        if(sum%3!=0) return false;
        
        int part=sum/3,temp=0,count=0;
        
        for(int i : arr){
            temp+=i;
            
            if(temp==part){
                count++;
                temp=0;
            } 
        }
        
        if(count>=3) return true;
        
        return false;
    }
}