//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        //contains every alphabet a-z: 97-122
        if(s.length()<26) return false;
        s= s.toLowerCase();
        HashSet<Character> hSet = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=(char)97 && s.charAt(i)<=(char)122)
                hSet.add(s.charAt(i));
        }
        if(hSet.size()==26) return true;
        return false;
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends