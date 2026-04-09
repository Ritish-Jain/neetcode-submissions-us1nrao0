class Solution {
    private void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private int parti(int nums[],int st,int end){
        int pivot=nums[end];
        int idx=st-1;
        for(int i=st;i<end;i++){
            if(nums[i]<pivot){
                idx++;
                swap(nums,i,idx);
            }
        }
        idx++;
        swap(nums,idx,end);
        return idx;
    }

    private void qs(int [] nums,int st,int end){
        if(st<end){
            int idx=parti(nums,st,end);
            qs(nums,st,idx-1);
            qs(nums,idx+1,end);
        }
    }

    public void sortColors(int[] nums) {
        int n=nums.length-1;
        qs(nums,0,n);
    }
}