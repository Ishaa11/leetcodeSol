class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums){
            if(i%2==0){
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }else{
                    map.put(i,1);
                }
            }
        }
        
        if(map.isEmpty()) return -1;
        
       int freq=0,val=0;
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            if(freq==0){
                val=m.getKey();
                freq=m.getValue();
            }
            else if(freq<m.getValue()){
                val=m.getKey();
                freq=m.getValue();
            }
            else if(freq==m.getValue()){
                val=(val>m.getKey())?m.getKey():val;
            }
        }
        
        return val;
    }
}