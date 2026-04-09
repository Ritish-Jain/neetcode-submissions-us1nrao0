class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        nums=Arrays.copyOf(nums, n*2);
        for(int i=n;i<n*2;i++)
            nums[i]=nums[i-n];
        return nums;
    }
}