//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_median(v);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

//User function Template for Java

//User function Template for Java


class Solution {
    public int find_median(int[] v) {
        // Sort the array in ascending order
        Arrays.sort(v);

        int n = v.length;

        // Check if the number of elements is even or odd
        if (n % 2 == 1) {
            // If the number of elements is odd, return the middle element
            return v[n / 2];
        } else {
            // If the number of elements is even, return the average of the two middle elements
            int mid1 = v[n / 2 - 1];
            int mid2 = v[n / 2];
            return (mid1 + mid2) / 2;
        }
    }
}
