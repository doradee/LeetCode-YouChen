/**
 * O(log n)
 * O(1)
 * 245 ms
 * 
 * Note:
 *      The tricky part is the first if statement inside the while loop.
 *      It saying that if the num[mid] is greater than its neighbors. then it's the peak index.
 *      And you need to add the corner case for if the mid is the left or right boundry of the array.
 *
 * Reference:
 *      http://siddontang.gitbooks.io/leetcode-solution/content/array/find_peak_element.html
 */
public class Solution {
    public int findPeakElement(int[] num) {//Mar 8 - 00:35
        int len = num.length;
        if(len == 1) return 0;
        
        //len >= 2.
        int left = 0, right = len - 1, mid = left + (right - left) / 2;
        while(left <= right){
            if( (mid == 0 || num[mid] > num[mid - 1]) && (mid == len - 1 || num[mid] > num[mid + 1]) )
                return mid;
            else if(mid >= 1 && num[mid] < num[mid - 1])
                right = mid - 1;
            else
                left = mid + 1;
            mid = left + (right - left) / 2;
        }
        return mid;
        
        
        /**
         * 1st Trail. Fail
         */
        // int len = num.length;
        // // if(len == 0 || num == null) return -1;
        
        // // if(len == 1) return 0;
        // // if(len == 2) return (num[0] < num[1])? 1 : 0;
        
        // int left = 0, right = len - 1, mid = len / 2;//these are the indices
        // while(left + 2 < right){
        //     if(num[left] <= num[mid]){//increasing(same) 
        //         if(num[mid] <= num[right]){//increasing(same) -> pick right
        //             left = mid;
        //         }else{//decreasing -> pick right ?
        //             left = mid;
        //         }
        //     }
        //     else{//decreasing
        //         if(num[mid] <= num[right]){//increasing(same) -> pick right
        //             left = mid;
        //         }else{//decreasing -> pick left
        //             right = mid;
        //         }
        //     }
        //     mid = left + (right - left) / 2;
        // }
        // return mid;
    }
}