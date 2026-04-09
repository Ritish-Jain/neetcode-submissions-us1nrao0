class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[]q= strs[0].toCharArray();
        int n=q.length;
        int re=-1;
        for(int i=0;i<n && re<0;i++){
            for(int j=1;j<strs.length;j++){
                char []w=strs[j].toCharArray();
                if(i<w.length){
                    if(q[i]!=w[i]){
                        re=i;
                    }
                }
                else
                    re=i;
            }
            if(i==n-1 && re<0)
                re=n;
        }
        String result="";
        for(int i=0;i<re;i++){
            result=result+q[i];
        }
        return result;
    }
}