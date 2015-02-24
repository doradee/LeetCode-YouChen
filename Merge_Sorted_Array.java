/**
 * O(m + n)
 * O(1)
 * 196 ms
 */
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // if(B.length == 0) return;
        if(n == 0) return;//nothing to merge.
        if(m == 0){//copy B to A.
            for(int i = 0; i < n; i++)
                A[i] = B[i];
            return;
        }
        /**
         * A is like 3, 4, 5, 7, 10, _ , _ , _ , _ , _ , _ ... m = 5
         * B is like 4, 7, 9, 14, _ , _ , _ ... n = 4
         * 
         * Merge them.
         */
         int index = m + n - 1;
         m--; n--;
         while (m >= 0 && n >= 0)
            A[index--] = (A[m] > B[n])? A[m--] : B[n--];
            
        if(m < 0)
            while(n >= 0)
                A[index--] = B[n--];
        /**
         * If all the elements of B are merged into A.
         * No need to copy the rest of A elements into A.
         */
        // else if(n < 0)
        //     while(m >= 0)
        //         A[index--] = A[m--];
    }
}