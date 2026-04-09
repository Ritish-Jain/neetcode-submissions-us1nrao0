class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length, q=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val)
                nums[q++]=nums[i];
        }
        
        return q;
    }
}