//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Searching
{
    public static void main (String[] args)throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
           String a[] = read.readLine().trim().split("\\s+");
           int n = Integer.parseInt(a[0]);
           long x = Long.parseLong(a[(int)1]);
           String st[] = read.readLine().trim().split("\\s+");
        
           long arr[] = new long[n];
           for(int i = 0; i < n; i++)
           {
               arr[i] = Long.parseLong(st[i]);
           }
           
           out.println(new Solution().findFloor(arr, n, x));
          
        }
        out.close();
    }
    
}
// } Driver Code Ends


class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        // return floor(arr,n,x,0,n-1);
        
        int start =0;
        int end =n-1;
        if (x < arr[start]) {
            return -1;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(x<arr[mid])  end=mid-1;
            else if(x>arr[mid])  start=mid+1;
            else    return mid;
        }
        return end;
    }
    // static int floor(long arr[], int n, long x, int s, int e){
    //     if(s>e) return -1;
    //     int m = s+(e-s)/2;
    //     if(x>arr[m])    return floor(arr, n, x, m+1, e);
    //     else if(x<arr[m])   return floor(arr, n, x, s, m-1);
    //     return m;
    // }
    
}
