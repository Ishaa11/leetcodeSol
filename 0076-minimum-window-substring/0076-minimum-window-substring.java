class Solution {
    public String minWindow(String s, String t) {
        
        int n=s.length(),m=t.length();
        
        if(m>n) return "";
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        
        int count=0,start=0,minleft=0,minlen=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);//decrease count of char if found in substring
                if(map.get(s.charAt(i))>=0){
                   count++;
                }
            }
            
            while(count==m){//eligible window
                //save length 
                if(minlen>i-start+1){
                    minlen=i-start+1;
                    minleft=start;
                }
                
                //remove char till becomes ineligible
                if(map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start),map.get(s.charAt(start))+1);
                    if(map.get(s.charAt(start))>0){
                        count--;
                    }
                }
                start++;
            }
        }
        
       if(minlen>n) return "";
            
        
        return s.substring(minleft,minleft+minlen);
    }
}