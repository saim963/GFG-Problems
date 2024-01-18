//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int count=1;//if count>size/2 than true 
        Arrays.sort(a);//15
        //majority element
        //failing (mine=14 -- correct=-1) , 13 elements
        // 9 14 10 10 1 2 1 7 10 10 14 19 9
        if(size==1){
           return a[0];
        }
        for(int i=0; i<size-1; i++){
            if(a[i]==a[i+1]){
               count++;
            }else if (a[i]!=a[i+1]) {
                count = 1;
            }
            if(count>size/2){
               return a[i];
            }
        }
        return -1;
    }
}