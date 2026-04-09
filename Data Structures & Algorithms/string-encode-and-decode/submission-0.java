class Solution {

    public String encode(List<String> strs) {
        StringBuilder str= new StringBuilder("");
        for(String s:strs){
            int n=s.length();
            str.append(n+"#"+s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> strs=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int len = 0;
            while (str.charAt(i) != '#') {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String s = str.substring(i, i + len);
            strs.add(s);
            i=i+len;
        }
        return strs;
    }
}
