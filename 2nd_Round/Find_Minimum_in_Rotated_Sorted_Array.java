/**
 * This solution is short and efficient.
 * Better do this again.
 */
public class Solution{
    public int findMin(int[] num){
    	if(num.length == 0 || num == null) return -1;
    
    	int left = 0, right = num.length - 1;
    	while(left < right){// && num[left] >= num[right])
    		int mid = left + (right - left) / 2;
    		if(num[mid] > num[right])
    			left = mid + 1;
    		else//mid <= right -- since mid might be the minimum.
    			right = mid;
    	}
    	return num[left];
    }
}