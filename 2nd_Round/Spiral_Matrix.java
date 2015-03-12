/**
 * 2nd round.
 * Easy. Practice.
 * 
 * Remember the special case of 1 row and 1 col
 *      also the special case of 1 row and 1 col in the iteration process.
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {//Mar 11 - 20:11 - 21:26 (1h 15m)
        ArrayList<Integer> l = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix == null) return l;
        
        int row = matrix.length, col = matrix[0].length;
        int top = 0, bottom = row - 1, left = 0, right = col - 1;
        
        //matrix only has 1 row
        if(row == 1){
            for(int i = 0; i < col; i++)
                l.add(matrix[0][i]);
            return l;
        }
        
        //matrix only has 1 col
        if(col == 1){
            for(int i = 0; i < row; i++)
                l.add(matrix[i][0]);
            return l;
        }
        
        
        
        while(left <= right && top <= bottom){
            //here you need to consider the 1 row and 1 col case
            if(left == right){
                for(int i = top; i <= bottom; i++)
                    l.add(matrix[i][left]);
                break;
            }
            if(top == bottom){
                for(int i = left; i <= right; i++)
                    l.add(matrix[top][i]);
                break;
            }
            
            
            
            
            for(int i = left; i < right; i++)
                l.add(matrix[top][i]);
            
            for(int i = top; i < bottom; i++)
                l.add(matrix[i][right]);
            
            for(int i = right; i > left; i--)
                l.add(matrix[bottom][i]);
                
            for(int i = bottom; i > top; i--)
                l.add(matrix[i][left]);
                
            left++;
            right--;
            top++;
            bottom--;
        }
        return l;
        
    }
}