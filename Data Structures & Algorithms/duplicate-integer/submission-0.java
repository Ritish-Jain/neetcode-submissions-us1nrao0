class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable <Integer,Integer> freq = new Hashtable<>();
        boolean result=false;
        for(int i=0;i<nums.length && result==false;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
                result=true;
            }
            else {
                freq.put(nums[i],1);
            }
        }
        return result;
    }
}