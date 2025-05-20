class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        // for (int i = 0; i<k ; i++){
        //     sum = sum + nums[i];
        // }
         for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i<n;i++){
            // Subtract the element leaving the window from the left
            sum = sum - nums[i - k];
            // Add the element entering the window from the right
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        
        return (double)maxSum/k;
    }
}