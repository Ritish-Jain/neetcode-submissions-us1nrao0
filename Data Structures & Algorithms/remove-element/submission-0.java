class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length, c=0;
        int []temp=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=val)
                temp[c++]=nums[i];
        }
        for(int q=0;q<c;q++)
            nums[q]=temp[q];
        for(int q=c;q<n;q++)
            temp[q]=val;
        
        return c;
    }
}