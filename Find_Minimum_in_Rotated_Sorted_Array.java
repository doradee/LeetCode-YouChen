/**
 * O(log n)
 * O(1)
 * 247 ms
 * 
 * Note:
 *      Draw a simple graph to analysis the case.
 *      This problem is actually finding a decreasing part if the array is really rotated.
 */
public class Solution {
    public int findMin(int[] num) {
        int len = num.length;
        if(num == null || len == 0) return -1;
        if(len == 1) return num[0];
        
        //these are the indices
        int left = 0, right = len - 1, mid = len / 2;
        
        while(left + 1 != right){
            if(num[left] > num[mid]){//left decreasing
                right = mid;
            }
            else if(num[mid] > num[right]){//right decreasing?
                left = mid;
            }
            else if(num[left] < num[mid] && num[mid] < num[right]){//both increasing
                right = mid;
            }else if(num[left] > num[mid] && num[mid] > num[right]){//both decreasing
                left = mid;
            }
            mid = left + (right - left) / 2;
        }
        return (num[right] < num[left])? num[right] : num[left];
    }
}