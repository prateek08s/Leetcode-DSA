//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public String transform(String s) {
        String[] words = s.split(" "); // Split the string into words
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) { // Skip empty words
                char firstLetter = Character.toUpperCase(word.charAt(0)); // Capitalize the first letter
                String restOfWord = word.substring(1); // Get the rest of the word
                result.append(firstLetter).append(restOfWord).append(" "); // Append the transformed word
            }
        }
        
        if (result.length() > 0) {
            // Remove the trailing space
            result.setLength(result.length() - 1);
        }
        
        return result.toString();
    }
}
