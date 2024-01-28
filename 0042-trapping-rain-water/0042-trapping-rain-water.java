class Solution {
    public int trap(int[] height) {
        //left right most
        int sum=0,level;
        int left[]=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        //right right most
        int right[]=new int[height.length];
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        //calculation
        for(int i=0;i<height.length;i++){
           level=Math.min(left[i],right[i]);
           sum+=level-height[i];
        }
        return sum;
    }
}