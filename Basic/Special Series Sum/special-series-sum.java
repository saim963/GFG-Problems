//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.sumOfTheSeries(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long sumOfTheSeries(long n){
        // code here
        int sum =0;
        for(int i=1; i<=n; i++){
            sum=sum+(i*(i+1)/2);
        }
        return sum;
    }
}https://media.geeksforgeeks.org/img-practice/fab-icon-new.gif