/**
 * O(log row + log col)
 * O(1)
 * 235 ms
 * 
 * Note:
 *      Easy one. But you need to remember the core principle of Binary Search.
 *      when the code "jump out of while loop", where the top bottom points to.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {//Mar 11 21:35
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;
        int Vmid = top + (bottom - top) / 2, Hmid = left + (right - left) / 2;
        
        //find the row.
        while(top <= bottom){
            if(matrix[Vmid][0] == target) return true;
            else if(matrix[Vmid][0] < target){
                top = Vmid + 1;
                // Vmid = top + (bottom - top) / 2;
            }
            else if(matrix[Vmid][0] > target){
                bottom = Vmid - 1;
                // Vmid = top + (bottom - top) / 2;
            }
            Vmid = top + (bottom - top) / 2;
        }
        
        /**
         * out of while, form the condition:
         *      bottom  ->  less    than Target
         *      top     ->  greater then Target
         * THIS IS VERY IMPORTANT RULE FOR BINARY SEARCH!!!
         */
         
        //if the bottom is pointing to -1, meaning no such element in the matrix.
        //      since reversely, if top points to matrix.length, there might be
        //          this element in the row of matrix[matrix.length - 1];
        if(bottom < 0) return false;
        
        //so the element must be in the row of which bottom points to.
        //      search for the element in this row.
        while(left <= right){
            if(matrix[bottom][Hmid] == target) return true;
            else if(matrix[bottom][Hmid] < target)
                left = Hmid + 1;
            else if(matrix[bottom][Hmid] > target)
                right = Hmid - 1;
            Hmid = left + (right - left) / 2;
        }
        return false;
    }
}