//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
        selectionSort(arr,i);
        return arr[i];
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0; i<n; i++){
	        int start =0;
	        int end = n -i -1;
	        int maxIndex = getMax(arr,0,end);
	        swap(arr,maxIndex,end);
	    }
	}
	int getMax(int[] arr, int start, int end){
	    int max= 0;
	    for(int i=start; i<=end; i++){
	        if(arr[i]>arr[max]){
	            max = i;
	        }
	    }
	    return max;
	}
	void swap(int[] arr, int first, int second){
	    int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	}
}