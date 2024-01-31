class Solution {
    public int singleNumber(int[] nums) {
        int temp=nums[0];
        int count=nums[0];
        for(int i=1;i<nums.length;i++){
        count=temp^nums[i];
        temp=count;
        }
        return count;
    }
}