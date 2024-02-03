//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.altProduct(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long altProduct(long arr[], long n)
    {
        //sum of product of alternate elements is minimum
        //0 2 4 5 6 7 8 9 -> 9*0 +8*2 +7*4 +6*5
        long sum =0;
        Arrays.sort(arr);
        for(int i=0; i<(int)n/2; i++){
            sum += arr[i]*arr[(int)n-i-1];
        }
        return sum;
    }
}