class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum=0,maxsum=0;
        for(int i=0;i<k;i++){
            windowsum += nums[i];
        }
        maxsum=windowsum;

        for(int i =k;i<=nums.length-1;i++){
            windowsum=windowsum-nums[i-k]+nums[i];
            maxsum=Math.max(maxsum,windowsum);
        }

        return (double) maxsum / k;
        
    }
}