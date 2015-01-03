public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

    	if (matrix.length == 0) {
    		return null;//new List<Integer>();
    	}
    	else if (matrix.length == 1) {
    		//like [3, 4, 8, 12, 65]
    		
            Integer[] newArray = new Integer[matrix[0].length];
            int i = 0;
            for (int value : matrix[0]) {
                newArray[i++] = Integer.valueOf(value);
            }
            return Arrays.asList(newArray);
    		
    	}
    	// else if (matrix[0].length == 1) {
    	// 	return 
    	// }

    	int row = matrix.length, col = matrix[0].length,
    		totalElements = row * col;

    	int upperRowBound = 0, leftColBound = 0, 
    		bottomRowBound = row - 1, rightColBound = col - 1;

        Integer[] sol = new Integer[totalElements];

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