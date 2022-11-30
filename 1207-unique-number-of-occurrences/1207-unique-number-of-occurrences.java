class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x : arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        
        HashSet<Integer> set = new HashSet<>(map.values());
        
        return set.size()==map.size();
    }
}