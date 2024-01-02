class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        Map<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        int maxFreq = 0, maxEle = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
        }
        
       
        int loop = maxFreq;
        
        for(int i=0;i<loop;i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                
                int key = entry.getKey();
                int value = entry.getValue();
                
                if(value!=0){
                    map.put(key, map.get(key) - 1);
                    list1.add(key);
                }
            }
            list.add(list1);
            
        }
        return list;
    }
    
   
}