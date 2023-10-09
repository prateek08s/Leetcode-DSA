//{ Driver Code Starts
import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}


// } Driver Code Ends


class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	for(int i=0;i<str.length();i++)
	{
	    char ch=str.charAt(i);
	    if(ch=='2'|| ch=='3'|| ch=='4'|| ch =='5' || ch=='6' || ch=='7'|| ch=='8' || ch=='9')
	    {
	    return false;
	    }
	}
	return true;
	}
}