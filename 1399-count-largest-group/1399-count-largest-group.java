class Solution {
    public int countLargestGroup(int n) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
         int max=1;
        
        for(int i=1;i<=n;i++){
            int sum=sumOfDigits(i);
        
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
             max = Math.max(max,map.get(sum));
        }
        
       
        int ans=0;
       for(int val:map.values()){
            if(val==max){
                ans++;
            }
        }
        
        return ans;
    }
    
     public int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}

