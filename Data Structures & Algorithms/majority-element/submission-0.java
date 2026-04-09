class Solution {
    public int majorityElement(int[] nums) {
        int candi=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candi)
                count++;
            else{
                count--;
                if(count==0){
                    candi=nums[i];
                    count++;
                }
            }
        }
        return candi;
    }
}