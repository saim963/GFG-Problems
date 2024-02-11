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
	int select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        selectionSort(arr,i);
        return arr[i];
        
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0; i<arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr,maxIndex,last);
        }
	}
    int getMaxIndex(int[] nums, int end){
        int max = 0;
        for(int i=0; i<=end; i++){
            if(nums[max]<nums[i]){
                max = i;
            }
        }
        return max;
    }
    void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}