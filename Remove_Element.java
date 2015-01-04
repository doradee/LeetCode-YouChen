//import java.util.*;
public class Solution {
    public int removeElement(int[] A, int elem) {
    	//Solution #1
//         ArrayList<Integer> arr = new ArrayList<Integer>();
        
// 		for(int item: A) {
// 			arr.add((Integer)item);
// 		}
		
// // 		while(arr.contains(new Integer(elem)))
// 		while(arr.remove(new Integer(elem)));
		
// 		for(int i = 0; i < arr.size(); i++)
// 		    A[i] = arr.get(i);
		    
// 		return arr.size();

		//Solution #2
		//Copied from https://oj.leetcode.com/discuss/3753/my-solution-for-your-reference
		// int begin = 0;
		// for (int i = 0; i < A.length; ++i) 
		// 	if (A[i] != elem) 
		// 		A[begin++] = A[i];
		// return begin;

		//Solution #3
		int size = 0;
		for (int i = 0; i < A.length; ++i) {
			if (A[i] != elem) {
				A[i] = A[size];
				size++;
			}
		}
	}
}