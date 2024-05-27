//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        int sum=0;
        while(n>0){
            int temp = n%10;
            sum += temp;
            n/=10;
        }
        if(palindrome(sum))   return 1;
        return 0;
    }
    boolean palindrome(int num){
        if(num<0)   return false;
        return (num==reverse(num));
    }
    int reverse(int num){
        int rev=0;
        int min = Integer.MIN_VALUE/10;
        int max = Integer.MAX_VALUE/10;
        while(num!=0){
            if(num<min || num>max)  return 0;
            rev = rev*10 + num%10;
            num/=10;
        }
        return rev;
    }
}