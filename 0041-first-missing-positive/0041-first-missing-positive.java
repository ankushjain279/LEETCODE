class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]>0){
         if(nums[i]==count){continue;}    
         if(nums[i]!=++count){
              return count;
         }
         }
        }
        return count+1;
    }
}