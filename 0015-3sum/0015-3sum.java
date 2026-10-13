import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        // Final result list
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one element
        for(int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate starting elements
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Find remaining two elements
            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Found triplet
                if(sum == 0) {

                    result.add(
                        Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                        )
                    );

                    // Skip duplicate left values
                    while(left < right &&
                          nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while(left < right &&
                          nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers
                    left++;
                    right--;
                }

                // Sum too small
                else if(sum < 0) {
                    left++;
                }

                // Sum too large
                else {
                    right--;
                }
            }
        }

        return result;
    }
}