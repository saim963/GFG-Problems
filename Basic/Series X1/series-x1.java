//{ Driver Code Starts
//Initial Template for Java//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int X =sc.nextInt();
		
            Solution ob = new Solution();
         
            long ans = ob.X1Series(X);
           
            System.out.println(ans);
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    long X1Series(int X){
        // code here 
        long ans = (long)Math.pow(X,3)+X;
         return ans;
    }
    
}