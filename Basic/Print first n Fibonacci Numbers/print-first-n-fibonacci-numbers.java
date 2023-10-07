//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends

class Solution {
    // Function to return list containing first n Fibonacci numbers.
    public static long[] printFibb(int n) {
        // Your code here

        long fibb[] = new long[n];

        if (n <= 0) 
        {
            return fibb; // Return an empty array if n is non-positive.
        } else if (n == 1) {
            fibb[0] = 1; // Special case for n = 1
        } 
        else if (n >= 2)
        {
            fibb[0] = 1;
            fibb[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibb[i] = fibb[i - 1] + fibb[i - 2];
        }

        return fibb;
    }
}
