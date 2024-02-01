class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        int temp=-1;
        for(int i=0;i<nums.length;i++){
            if(target>nums[i]){continue;}
            else if(target==nums[i]){
                if(arr[0]==-1){arr[0]=i;}
                 temp=i;
            }
            else{break;}
        }
        arr[1]=temp;
        return  arr;
    }
}