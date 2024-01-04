import java.util.*;

class Solution {
    Scanner sc = new Scanner(System.in);

    public int maxSubArray(int[] nums)
    {
     // Initialize the maximum sum to the smallest possible long value
        long maxi = Long.MIN_VALUE;
        long sum = 0;
    // Use nums.length instead of sc.nextInt() to get the length of the input array
        int n = nums.length; 

        for (int i = 0; i < n; i++) 
        {
            sum += nums[i]; // Fix the variable name from arr to nums

            if (sum > maxi) 
            {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) 
            {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:
        // if (maxi < 0) maxi = 0;

        return (int) maxi; // Return the maximum sum as an integer
    }
}
