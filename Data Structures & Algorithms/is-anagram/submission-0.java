class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++) {
            char sch = s.charAt(i);
            char tch  = t.charAt(i);
            map.put(sch, map.getOrDefault(sch, 0)+1);
            map.put(tch, map.getOrDefault(tch, 0)-1);
        }

        for(int count: map.values()){
            if(count !=0){
                return false;
            }
        }
        return true;
    }
}
