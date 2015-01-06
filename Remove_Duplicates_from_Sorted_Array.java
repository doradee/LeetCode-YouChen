/**
 * O(n)
 * 264 ms
 * 
 * Array
 *      Two pointers
 */
public class Solution {
    public int removeDuplicates(int[] A) {
        /**
         * This Problem cost so much time,
         * Do it again.
         */
        if(A.length <= 1) return A.length;
        int i = 0, j = 1;
        while(j < A.length){
            if(A[j] == A[i]) j++;
            else{
                i++;
                A[i] = A[j];
                j++;
            }
        }
        return i + 1;
        
//       //HashSet
// 		HashSet<Integer> hs = new HashSet<Integer>();
// 		for(int item : A)
// 			hs.add(item);
// 		int index = 0;
// 		for(Object item : hs.toArray())
// 			A[index++] = (int) item;

// 		for(int i : A)
// 			System.out.println(i + " ");
		
// 		return hs.size();
        
        
    }//method
}