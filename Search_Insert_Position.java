/**
 * O(log n)
 * 213 ms
 * 
 * Array
 * BinarySearch
 */ 
public class Solution {//33 min
    public int searchInsert(int[] A, int target) {
        if(A.length == 0) return 0;
        if(target > A[A.length - 1]) return A.length;
        
        int left = 0, right = A.length - 1, mid = 0;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(A[mid] == target)
                return mid;
            else if(A[mid] < target){
                left = mid + 1;
            }
            else
                right = mid - 1;
        }//while
        if(A[mid] > target) return mid;
        else return mid + 1;
    }
}