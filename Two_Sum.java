import java.util.*;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] sol = new int[2];
        
        // /**
        //  * trial #1
        //  */
        // for(int i = 0; i <= numbers.length - 2; i++){
            
        //     for(int j = i + 1; j <= numbers.length - 1; j++){
        //         if (numbers[i] + numbers[j] == target){
        //             sol[0] = i + 1;
        //             sol[1] = j + 1;
        //             return sol;
        //         }//if
        //         //if( j == numbers.length - 1) break;   
        //     }//j
        //     //if(numbers[i] > target) break;
        // }//i
        
        /**
         * trial #2
         */
        int backIndex = numbers.length - 1;
        
        for(int i = 0; i <= numbers.length - 2; i++){
            if (numbers[i] + numbers[backIndex] == target){
                    sol[0] = i + 1;
                    sol[1] = backIndex + 1;
                    return sol;
            }//if
            while( numbers[backIndex] > target )//|| numbers[backIndex] > target - numbers[i])
                backIndex--;
        }
        
        
        
        return null;
        
    }
}