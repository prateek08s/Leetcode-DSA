import java.util.Scanner;

class Solution
{
    public void setZeroes(int[][] matrix) 
    {
        Scanner sc = new Scanner(System.in);
        int r = matrix.length;
        int c = matrix[0].length;

        int[] col = new int[c]; // Declare an array for columns
        int[] row = new int[r]; // Declare an array for rows

        // Iterate through the matrix to mark the rows and columns with zeros
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                if (matrix[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set zeros based on the marked rows and columns
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                if (row[i] == 1 || col[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
