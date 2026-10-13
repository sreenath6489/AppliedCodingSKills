class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowsum=0;
        int count =0;
        for(int i=0;i<k;i++){
            windowsum += arr[i];
        }
        if (windowsum>=threshold*k){
            count++;
        }

        for(int i =k;i<arr.length;i++){
            windowsum=windowsum-arr[i-k]+arr[i];
        

        if(windowsum>=threshold*k){
            count ++;
        }
        }
        return count ;
        
    }
}