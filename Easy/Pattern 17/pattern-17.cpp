//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
class Solution {
  public:
    void printTriangle(int n) {
        // code here
        //3-1-3,2-3-2,1-5-1,0-7-0
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
               cout<<" ";
            }
            char X='A';
            int brkpnt = (2*i-1)/2;
            //characters (2*i-1)
            for(int j=1; j<=(2*i-1); j++){
                cout<<X;
                if(j<=brkpnt) X++;
                else X--;
            }
            cout<<endl;
        }
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;

        Solution ob;
        ob.printTriangle(n);
    }
    return 0;
}
// } Driver Code Ends