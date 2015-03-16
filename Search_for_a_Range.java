/**
 * O(log n + log n) = O(log n)
 * O(1)
 * 271 ms
 * 
 * Note:
 *      Need to master the BS application for real problem.
 */
public class Solution {
    public int[] searchRange(int[] A, int target) {
    	if(A.length == 0 || A == null)
    		return null;
    	int[] range = {-1, -1};
    	int start = firstGreaterEqual(A, target);
    	if(start == A.length || A[start] != target)
    		return range;

    	//found target
    	int end = firstGreaterEqual(A, target + 1) - 1;
    	range[0] = start;
    	range[1] = end;
    	return range;
    }

    public int firstGreaterEqual(int[] A, int target){
    	int left = 0, right = A.length;
    	while(left < right){
    		int mid = left + (right - left) / 2;
    		if(A[mid] < target)
    			left = mid + 1;
    		else
    			right = mid;
    	}
    	return left;
    }
}