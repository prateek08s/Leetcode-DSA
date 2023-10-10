//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends

class GfG
{
    public static int palinArray(int[] a, int n)
    {
        for (int i = 0; i < n; i++)
        {
            String str = Integer.toString(a[i]); // Convert the integer to a string
            int len = str.length();
            
            for (int j = 0; j < len / 2; j++)
            {
                if (str.charAt(j) != str.charAt(len - 1 - j))
                {
                    return 0; // Not a palindrome
                }
            }
        }
        
        return 1; // All elements are palindromes
    }
}
