class Solution {
    private void swap(int []nums, int i,int idx){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
    private int pati(int[] nums, int st, int end){
        int idx=st-1;
        for(int i=st;i<end;i++){
            if(nums[i]<nums[end]){
                idx++;
                swap(nums,i,idx);
            }
        }
        idx++;
        swap(nums,idx,end);
        return idx;
    }
    private void qs(int[] nums, int left, int right){
        if(left<right){
            int idx=pati(nums,left,right);
            qs(nums,left,idx-1);
            qs(nums,idx+1,right);
        }
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        qs(nums,0,n-1);
        return nums;
    }
}