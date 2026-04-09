class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap <Character,Integer> freq= new HashMap<>();

        for(char i:s.toCharArray()){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for (char c: t.toCharArray()){
            if(!freq.containsKey(c))
                return false;
            freq.put(c,freq.get(c)-1);
            if(freq.get(c)==0)
                freq.remove(c);
        }
        return freq.isEmpty();
    }
}
