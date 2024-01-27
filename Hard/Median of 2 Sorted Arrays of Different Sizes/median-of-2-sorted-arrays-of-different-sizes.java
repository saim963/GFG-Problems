//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int[] ans = new int[n+m];
        System.arraycopy(a, 0, ans, 0, n);
        System.arraycopy(b, 0, ans, n, m);
        //here suppose that ans holds arr1 and arr2 
        int len = ans.length;
        Arrays.sort(ans);
        if (ans.length % 2 != 0)
        {
         return (double)ans[ans.length / 2];
        }
        return (double)(ans[(ans.length - 1) / 2] + ans[ans.length / 2]) / 2.0;
    }
}
