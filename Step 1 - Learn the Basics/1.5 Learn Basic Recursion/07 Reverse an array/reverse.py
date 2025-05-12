# https://www.geeksforgeeks.org/problems/reverse-an-array/0

class Solution:
    def helper(self,arr,start,end):
        if(start>=end):
            return
        arr[start],arr[end]=arr[end],arr[start]
        self.helper(arr,start+1,end-1)
    def reverseArray(self, arr):
        # code here
        self.helper(arr,0,len(arr)-1)
        return arr
        

#Iterative Solution
# Python Program to reverse an array by swapping elements

def reverseArray(arr):
    n = len(arr)
    
    # Iterate over the first half and for every index i,
    # swap arr[i] with arr[n - i - 1]
    for i in range(n // 2):
        temp = arr[i]
        arr[i] = arr[n - i - 1]
        arr[n - i - 1] = temp

if __name__ == "__main__":
    arr = [1, 4, 3, 2, 6, 5]

    reverseArray(arr)
  
    for i in range(len(arr)):
        print(arr[i], end=" ")