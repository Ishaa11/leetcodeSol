class Solution {
    public int maximum69Number (int num) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int n=num;
        
        while(n>0){
            list.add(n%10);
            n=n/10;
        }
        
        Collections.reverse(list);
        
        for(int i=0;i<list.size();i++){
            if(list.get(i)==6){
                list.set(i,9);
                break;
            }
        }
        
        int result = 0;
        for(int i=0;i<list.size();i++){
            result=result*10+list.get(i);
        }
        
        return result;
    }
}