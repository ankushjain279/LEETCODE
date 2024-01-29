class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int curr_sum=0;
        int all_neg=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
        all_neg++;
        }    
        curr_sum+=nums[i];
        if(curr_sum<0){
        curr_sum =0;
        }
        if(max<curr_sum){
         max=curr_sum;
        }
    }
        if(all_neg==nums.length){
        Arrays.sort(nums);
        return nums[nums.length-1];
        }
        else{
            return max;
        }
 }
}