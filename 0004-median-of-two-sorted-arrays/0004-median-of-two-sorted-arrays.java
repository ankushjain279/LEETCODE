class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int median[]=new int[nums1.length+nums2.length];
        int len=median.length;
        System.arraycopy(nums1,0,median,0,nums1.length);
        System.arraycopy(nums2,0,median,nums1.length,nums2.length);
        Arrays.sort(median);
        double val;
        if(len%2==0){
        val=(double)((median[(len-1)/2]+median[((len-1)/2)+1])/2.0);
        }
        else
        {
        val=median[(len)/2];
        }
        return val;
    }
}