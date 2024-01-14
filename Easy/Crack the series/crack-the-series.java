//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.math.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.NthTerm(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static BigInteger NthTerm(int N){
        // 2 2 4 8 16 512
        //odd = prev^2 & even = prev^3
        BigInteger Term = BigInteger.TWO;
        if(N%2==1){
            for(int i=3; i<=N; i+=2){
                Term = Term.pow(2);
            }
        }else{
            for(int i=4; i<=N; i+=2){
                Term = Term.pow(3);
            }
        }
        return Term;
    }
}