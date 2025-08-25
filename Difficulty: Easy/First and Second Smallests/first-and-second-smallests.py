class Solution:
    def minAnd2ndMin(self, arr):
        if len(arr) < 2:
            return [-1]
        
        min_x = float('inf')
        min_y = float('inf')
        
        for num in arr:
            if num <min_x:
                min_y = min_x
                min_x = num
            elif num < min_y and num != min_x:
                min_y = num
                
        if min_y == float('inf'):
            return [-1]
            
        return [min_x,min_y]
        
