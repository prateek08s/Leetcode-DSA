//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(S));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String S) {
        // Convert the string to a character array
        char[] charArray = S.toCharArray();
        
        // Initialize two pointers, one at the beginning and one at the end of the array
        int start = 0;
        int end = S.length() - 1;
        
        // Reverse the characters by swapping the characters at the start and end pointers
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        
        // Convert the character array back to a string
        String reversedString = new String(charArray);
        
        return reversedString;
    }
}
