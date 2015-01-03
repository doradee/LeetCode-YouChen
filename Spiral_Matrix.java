public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	int row = matrix.length, col = matrix[0].length,
    		totalElements = row * col;

    	int upperRowBound = 0, leftColBound = 0, 
    		bottomRowBound = row - 1, rightColBound = col - 1;

        int[] sol = new int[totalElements];

        int curRow = 0, curCol = 0;

        int i = 0;
        // for (int i = 0; i < totalElements - 1; i++) {
        while(i < totalElements - 1){
        	while (curRow == upperRowBound && curCol <= rightColBound - 1) 
        		sol[i++] = matrix[curRow][curCol++];

        	upperRowBound++;

        	while (curCol == rightColBound && curRow <= bottomRowBound - 1) 
        		sol[i++] = matrix[curRow++][curCol];

        	rightColBound--;

        	
        	while (curRow == bottomRowBound && curCol >= leftColBound - 1)
        		sol[i++] = matrix[curRow][curCol--];

        	bottomRowBound--;

        	while (curCol == leftColBound && curRow >= upperRowBound - 1)
        		sol[i++] = matrix[curRow--][curCol];

        	leftColBound++;

        	
        }//while

        return Arrays.asList(sol);
    }
}