//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        ArrayList<Integer> list = new ArrayList<>();
        int digits =0;
        int org =N;
        while(N>0){
            int temp = N%10;
            list.add(temp);
            digits++;
            N/=10;
        }
        int count = 0;
        for(int i = digits - 1; i >= 0; i--){
            if(list.get(i)!=0 && org%list.get(i) == 0){
                count++;
            }
        }
        return count;
    }
}