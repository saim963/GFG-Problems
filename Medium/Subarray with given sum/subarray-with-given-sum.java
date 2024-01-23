//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        /*int left = 0;
        int right = 0;
        int check = 0;
        int i = 1;
        while(i<=n){
            if(check < s){
                check += arr[right];
                if(check>=s){
                    --right;
                }
                right++;
            }
            if(check > s){
                check -= arr[left];
                if(check<s){
                    --left;
                }
                left++;
            }
            i++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(++left);
        list.add(++right);
        //okay calculate it for 0 index and then give output by adding 1
        return list;*/
        
        
        //Took a lil help from the AI to lookout for the missing peice of puzzle
        // Edge case: If n is 1 and the single element equals s, return 1
        if (arr[0] == s) {
            return new ArrayList<>(List.of(1, 1));
        }
        // Edge case if s=0
        if(s==0 && n!= 1)
            return new ArrayList<>(List.of(-1));

        // Using two pointers here
        int left = 0;
        int right = 0;
        int check = 0;

        while (right < n) {
            check += arr[right];
            while (check >= s) {
                // If the sum is equal to s, return the subarray indices
                if (check == s) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(left + 1);  // Add 1 because indices are 1-based
                    list.add(right + 1);
                    return list;
                }

                check -= arr[left];
                left++;
            }
            right++;
        }
        // If no subarray is found, return [-1]
        return new ArrayList<>(List.of(-1));
    }
}