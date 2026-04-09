class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> numsIndex=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(numsIndex.containsKey(diff)){
                result[0]=numsIndex.get(diff);
                result[1]=i;
                return result;
            }
            else
                numsIndex.put(nums[i],i);
        }
        return result;
    }
}
