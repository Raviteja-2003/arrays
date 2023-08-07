class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
       for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
               if(grid[i][j]==0){
                   for(int val=1;val<=9;val++){
                       if(isValid(grid,i,j,val)){
                           grid[i][j]=val;
                           if(SolveSudoku(grid)==true){
                               return true;
                           }
                           else{
                               grid[i][j]=0;
                           }
                       }
                   }
                   return false;
               }
           }
       }
       return true;
    }
    static boolean isValid(int grid[][],int i,int j,int val){
        for(int k=0;k<9;k++){
            if(grid[i][k]==val) return false;
            if(grid[k][j]==val) return false;
            if(grid[3*(i/3)+k/3][3*(j/3)+k%3]==val) return false;
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}