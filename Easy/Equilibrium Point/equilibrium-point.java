//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        /*
        int Sr = 0;
        int Sl = 0;
        if(n==1) return 1;
        for(int i=1; i<n; i++){
            Sr += arr[i];
        }
        for(int i=0; i<n-1; i++){
            if(Sl==Sr)
                return i+1;
            
            Sl += arr[i];
            Sr += arr[i+1];
        }
        return -1;*/
        // Your code here
        long sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        
        // Now we check (sum of prefix == sum of suffix)
        long prefix=0;
        for(int i=0;i<n;i++){
            
            // (sum of suffix = sum-prefix-a[i])
            if(prefix == sum-prefix-arr[i]){
                return i+1;
            }
            else{
                // first element added to prefix
                prefix=prefix+arr[i];
            }
        }
        return -1;
    }
}
