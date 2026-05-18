//using hashmap as a hint 

class Solution {
    public boolean isAnagram(String s, String t) {
         //obvious length check
       if (s.length() != t.length()){
           return false;
       }

       HashMap<Character,Integer> map = new HashMap<>();

       //build using s
       for (char ch: s.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);

       }

       //using t
       for (char ch : t.toCharArray()){
           if (!map.containsKey(ch)){
               return false;
           }
           map.put(ch, map.get(ch)-1);

           if(map.get(ch)<0){
               return false;
           }
       }
       return true;
   
    }
}
