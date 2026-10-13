class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;

        int ans[]=new int[nums.length];


        while(left<=right){
            int leftsquare=nums[left]*nums[left];
            int rightsqaure=nums[right]*nums[right];

            if(leftsquare>rightsqaure){
                ans[index]=leftsquare;
                left++;
            }

            else{
                ans[index]=rightsqaure;
                right--;
            }
            index--;

        }
        return ans ;
    }
}