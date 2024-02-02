class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length-1;
        int start=nums[0]*nums[1]*nums[l];
        int end=nums[l]*nums[l-1]*nums[l-2];
        return Math.max(start,end);
    }
}