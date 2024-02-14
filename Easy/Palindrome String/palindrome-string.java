//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String s) {StringBuilder builder = new StringBuilder();
        String x =s.toLowerCase();//every element is in lowercase
        //non-alphanumeric characters means other than alphabets nad numbers
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)>=(char)48 && x.charAt(i)<=(char)57 || x.charAt(i)>=(char)97 && x.charAt(i)<=(char)122){
                builder.append(x.charAt(i));
            }
        }
        if(builder.toString().contentEquals(builder.reverse())) return 1;
        return 0;
    }
};