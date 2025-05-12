// https://www.geeksforgeeks.org/problems/reverse-an-array/0

//Recursion 
class Solution {
    public void reverseArray(int arr[]) {
       
    reverse(arr,0,arr.length-1);
        
    }
    public void reverse(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,end-1);
    }
}

//Iterative Approach
// Java Program to reverse an array by swapping elements

// import java.util.Arrays;

// class GfG {
    
//     // function to reverse an array
//     static void reverseArray(int[] arr) {
//         int n = arr.length;
        
//         // Iterate over the first half and for every index i,
//         // swap arr[i] with arr[n - i - 1]
//         for (int i = 0; i < n / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[n - i - 1];
//             arr[n - i - 1] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 4, 3, 2, 6, 5 };

//         reverseArray(arr);
  
//         for (int i = 0; i < arr.length; i++) 
//             System.out.print(arr[i] + " ");
//     }
// }