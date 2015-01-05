public class Solution {
    public void sortColors(int[] A) {
        int r = 0, w = 0, b = 0;
        for(int item : A){
            switch(item){
                case 0: 
                    ++r;
                    break;
                case 1: 
                    ++w;
                    break;
                case 2:
                    ++b;
                    break;
            }//switch
        }//for
        int index = 0;
        while(r > 0){
            A[index++] = 0;
            r--;
        }
        while(w > 0){
            A[index++] = 1;
            w--;
        }
        while(b > 0){
            A[index++] = 2;
            b--;
        }
            
    }
}