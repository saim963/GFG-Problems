//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // Arrays.sort(arr);
        // ArrayList<Integer> list = new ArrayList<>();
        // int i=0;
        // while(i<n-1){
        //     if(arr[i]==arr[i+1]){
        //         list.add(arr[i+1]);
        //     }
        //     i++;
        // }
        // if(!list.isEmpty())
        //     return list;
        // return new ArrayList<>(List.of(-1));
        
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<(n-1); i++){
            if (arr[i] == arr[i+1]){
                list.add(arr[i]);             
            }
        }
        if(!list.isEmpty()){
            Set<Integer> uniqueDuplicates = new HashSet<>(list);
            // Collections.sort(numbers);
            ArrayList<Integer> uList = new ArrayList<>(uniqueDuplicates);
            Collections.sort(uList);
            
            return uList;
        }
        return new ArrayList<>(List.of(-1));
        
        // Arrays.sort(arr);
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i=0; i<(n-1); i++){
        //      if (arr[i] == arr[i+1]){
        //          list.add(arr[i]);             
        //     }
        // }
        
        // if(!list.isEmpty()){
        //     for (int i=0; i<list.size()-1;i++){
        //         if(list.get(i)==list.get(i+1)){
        //             list.remove(i+1);
        //         }
        //     }
        //     return list;
        // }
        // list.add(-1);
        // return list;
    }
}
