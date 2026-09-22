//class Solution {
   // public int[][] matrixReshape(int[][] mat, int r, int c) {
      //  int [][] reshapematrix= new int[r][c];
    //    Queue<Integer> line= new LinkedList<>();
  //      int rows=mat.length;
//        int cols= mat[0].length;
       // if(rows*cols!=r*c){
     //       return mat;
   //     }
 //       for(int row=0;row<mat.length;row++){
            //for (int col =0;col<mat[0].length;col++)
          //  {
        //        line.offer(mat[row][col]);
      //      }
    //    }
  //      for(int row=0; row<reshapematrix.length;row++){
//            for(int col=0;col<reshapematrix[0].length;col++){
            //  
             //       reshapematrix[row][col]=line.poll();
          //      
        //    }
      //  }
    //    return reshapematrix;
  //  }
//}
class Solution{
    public int[][] matrixReshape(int[][] mat, int r, int c){
        int rows= mat.length;
        int cols= mat[0].length;
        if(rows*cols!= r*c){
            return mat;
        }
        int[][] reshapematrix= new int [r][c];
        int index=0;
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                reshapematrix[index/c][index%c]= mat[row][col];
                index++;
            }
        }
        return reshapematrix;
    }
}