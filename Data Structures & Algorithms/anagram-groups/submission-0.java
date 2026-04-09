class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[]temp=s.toCharArray();
            Arrays.sort(temp);
            String sSort= new String(temp);
            map.putIfAbsent(sSort,new ArrayList<>());
            map.get(sSort).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
