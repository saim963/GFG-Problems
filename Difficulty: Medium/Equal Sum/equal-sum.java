//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    String equilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0, check =0;
        for(int num: arr){
            sum += num;
        }
        for(int i=0; i<n; i++){
            sum -= arr[i];
            if(sum==check)  return "true";
            check += arr[i];
        }
        return "false";
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            String res = obj.equilibrium(arr);

            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends