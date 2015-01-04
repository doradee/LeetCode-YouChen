public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

         ArrayList<Integer> sol = new ArrayList<Integer>();

            if (matrix.length == 0 || matrix == null) return sol;
            //1 row
            if (matrix.length == 1) {
                for (int i = 0; i < matrix[0].length; i++) {
                    sol.add(matrix[0][i]);
                }
                return sol;
            }
            //1 col
            if (matrix[0].length == 1) {
                for (int i = 0; i < matrix.length; i++) {
                    sol.add(matrix[i][0]);
                }
                return sol;
            }

            int row = matrix.length, col = matrix[0].length,
            totalElements = row * col;

            int upperRowBound = 0, leftColBound = 0, 
            bottomRowBound = row - 1, rightColBound = col - 1;


            int curRow = 0, curCol = 0;

            while(sol.size() <= totalElements){
                while (curRow == upperRowBound && curCol <= rightColBound) {

                    if(sol.size() == totalElements) return sol;
                    sol.add(matrix[curRow][curCol++]);
                }
                if(curCol - 1 == rightColBound) curCol--;
                curRow++;
                if(upperRowBound + 1 <= bottomRowBound - 1)
                    upperRowBound++;
                
                

                while (curCol == rightColBound && curRow <= bottomRowBound) {
                    if(sol.size() == totalElements) return sol;
                    sol.add(matrix[curRow++][curCol]);
                }
                if(curRow - 1 == bottomRowBound) curRow--;
                curCol--;
                if(rightColBound - 1 >= leftColBound + 1)
                    rightColBound--;
                
                

                while (curRow == bottomRowBound && curCol >= leftColBound){
                    if(sol.size() == totalElements) return sol;
                    sol.add(matrix[curRow][curCol--]);
                }
                if(curCol + 1 == leftColBound) curCol++;
                curRow--;
                if(bottomRowBound - 1 >= upperRowBound + 1)
                    bottomRowBound--;
                

                while (curCol == leftColBound && curRow >= upperRowBound){
                    if(sol.size() == totalElements) return sol;
                    sol.add(matrix[curRow--][curCol]);
                }
                if(curRow + 1 == upperRowBound) curRow++;
                curCol++;
                if(leftColBound + 1 <= rightColBound - 1)
                    leftColBound++;
                

                
            }//while

            return sol;
    }
}