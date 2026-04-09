class Solution {
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void sortColors(int[] nums) {
        int n=nums.length;
        int st=0, end=n-1, mid=0;
        while(mid<=end){
            if(nums[mid]==2){
                swap(nums,mid,end);
                end--;
            }
            else if(nums[mid]==0){
                swap(nums,st,mid);
                mid++;
                st++;
            }
            else 
                mid++;
        }
    }
}