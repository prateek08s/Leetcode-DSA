class Solution {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        int index = -1;

// Find the first element from the right that is smaller than the element to its right
        for (int i = length - 2; i >= 0; i--) 
        {
            if (nums[i] < nums[i + 1]) 
            {
                index = i;
                break;
            }
        }

// If no such element is found, the array is in descending order, so reverse it
        if (index == -1) 
        {
            reverse(nums, 0, length - 1);
        } 
        else 
        {
// Find the smallest element to the right of index that is greater than nums[index]
            for (int i = length - 1; i > index; i--) 
            {
                if (nums[i] > nums[index]) 
                {
                    // Swap the elements at index and i
                    swap(nums, index, i);
                    break;
                }
            }
            
            // Reverse the subarray to the right of index
            reverse(nums, index + 1, length - 1);
        }
    }

    private void swap(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) 
    {
        while (start < end) 
        {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
