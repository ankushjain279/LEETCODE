class Solution {
    public int missingNumber(int[] nums) {
     int n=nums.length,as=0;
     int sum=n*(n+1)/2;
     for(int i=0;i<n;i++){
     as+=nums[i];
     }   
        return sum-as;
    }
}