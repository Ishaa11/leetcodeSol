class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<>();
        
        HashMap <String,List<String>> map =  new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            
            String newword = new String(letters);
            
            if(map.containsKey(newword)){
                map.get(newword).add(word);
            }else{
                List<String> addwords = new ArrayList<>();
                addwords.add(word);
                map.put(newword,addwords);
            }
            
        }
        
        list.addAll(map.values());
        
        
        return list;
    }
}