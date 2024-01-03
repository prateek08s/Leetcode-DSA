class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1; // Index 1 for the breaking point
        int ind2 = -1; // Index 2 for the next greater element

        // Step 1: Find the breaking point
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind1 = i;
                break;
            }
        }

        // If there is no breaking point, reverse the entire array
        if (ind1 == -1) {
            reverse(nums, 0);
        } else {
            // Step 2: Find the next greater element and swap with ind1
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[ind1]) {
                    ind2 = i;
                    break;
                }
            }

            swap(nums, ind1, ind2);

            // Step 3: Reverse the rest of the array to the right of ind1
            reverse(nums, ind1 + 1);
        }
    }

    // Function to swap two elements in the array
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Function to reverse the array from the given start index
    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
