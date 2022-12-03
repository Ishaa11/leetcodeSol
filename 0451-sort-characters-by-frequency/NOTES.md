HashMap<Character,Integer> map = new HashMap<>();
char[] ch = s.toCharArray();
for(char c : ch){
if(map.containsKey(c)){
map.put(c,map.get(c)+1);
}else{
map.put(c,1);
}
}
ArrayList<Integer> list = new ArrayList<>(map.values());
Collections.sort(list);
String x ="";
for(int i=0;i<list.size();i++){
int j = list.get(i);
if(map.containsValue(j)){
char x = map.get()
map.replace(x,0);
}
}