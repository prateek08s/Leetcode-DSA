class Solution {
    // Method to generate Pascal's Triangle up to numRows
    public List<List<Integer>> generate(int numRows) {
        // Initialize the list to store the entire triangle
        List<List<Integer>> triangle = new ArrayList<>();

        // Handle the base case for the first row (row index 0)
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);  // Pascal's Triangle always starts with 1
        triangle.add(first_row);

        // Iterate through each row starting from the second row
        for (int i = 1; i < numRows; i++) {
            // Get the previous row to calculate the current row
            List<Integer> prev_row = triangle.get(i - 1);

            // Initialize the current row
            List<Integer> curr_row = new ArrayList<>();

            // The first element of each row is always 1
            curr_row.add(1);

            // Calculate the elements in the middle of the row using the previous row
            for (int j = 1; j < i; j++) {
                curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }

            // The last element of each row is always 1
            curr_row.add(1);

            // Add the current row to the triangle
            triangle.add(curr_row);
        }

        // Return the generated Pascal's Triangle
        return triangle;
    }
}
