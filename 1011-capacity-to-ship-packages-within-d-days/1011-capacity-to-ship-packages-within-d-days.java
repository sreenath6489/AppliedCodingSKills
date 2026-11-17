class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }

        while(left<right){
            int mid =(left+right)/2;
            int requiredDays=1;
            int currentload=0;

            for(int weight:weights){
                if(currentload+weight>mid){
                    requiredDays++;
                    currentload=0;
                }
                currentload+=weight;
            }
            if(requiredDays<=days){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left ;
    }
}