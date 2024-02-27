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
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int nthFibonacci(int n){
        if (n <= 1) return n; // Base cases: 0 and 1
        long prev = 0;
        long curr = 1;
        for (int i = 2; i <= n; i++) {
        // Calculate next modulo 1000000007
            long next = (prev + curr) % 1000000007;
            prev = curr;
            curr = next;
        }
    return (int)curr;
    }
}