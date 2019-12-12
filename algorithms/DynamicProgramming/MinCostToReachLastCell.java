public class MinCostToReachLastCell {
    /*
    * we given 2d matrix
	* each cell have a cost associated with it
	* we need to start (0,0) and go till(n-1,n-1)
	* we can go only right or down from current cell
	* challenge is to do the traversal in minimum cost
     */


//    public int calminCost(int [][]matrix,int index_x,int index_y){
//
//        if(index_x == matrix.length-1 && index_y< matrix.length-1){
//            // go down
//            return matrix[index_x] [index_y] + calminCost(matrix,index_x,index_y+1);
//        }
//
//        if(index_y == matrix.length-1 && index_x < matrix.length-1){
//            // go right
//            return matrix[index_x] [index_y]  + calminCost(matrix,index_x+1,index_y);
//        }
//
//        if(index_x == matrix.length-1 &&  index_y == matrix.length-1){
//            return matrix[index_x] [index_y];
//        }
//
//        int x = matrix[index_x] [index_y] + calminCost(matrix,index_x,index_y+1);
//        int y = matrix[index_x] [index_y] + calminCost(matrix,index_x+1,index_y);
//
//        return Integer.min(x,y);
//    }

    public int findMinCost(int[][] cost, int row, int col) {
        if (row == -1 || col == -1) {  //BASE CASE
            return Integer.MAX_VALUE;
        }
        if (row == 0 && col == 0) { //BASE CASE: If we're at first cell (0, 0),then no need to recurse
            return cost[0][0];
        }

        int minCost1 = findMinCost(cost, row - 1, col);//Case#1 Get min cost if we go 'up' from current cell
        int minCost2 = findMinCost(cost, row, col - 1);//Case#2 Get min cost if we go 'left' from current cell

        int minCost = Integer.min(minCost1, minCost2);

        int currentCellsCost = cost[row][col];
        return  minCost + currentCellsCost;
    }//end of method



    public int findMinCost_TD(int[][] cost, int row, int col,int dp[][]){

        if (row == -1 || col == -1) {  //BASE CASE
            return Integer.MAX_VALUE;
        }
        if (row == 0 && col == 0) { //BASE CASE: If we're at first cell (0, 0),then no need to recurse
            return cost[0][0];
        }

        if(dp[row][col]==0){
            int minCost1 = findMinCost(cost, row - 1, col);//Case#1 Get min cost if we go 'up' from current cell
            int minCost2 = findMinCost(cost, row, col - 1);//Case#2 Get min cost if we go 'left' from current cell

            int minCost = Integer.min(minCost1, minCost2);
            int currentCellsCost = cost[row][col];

            dp[row][col] =  minCost + currentCellsCost;
        }

    return dp[row][col];
    }

    public int findMinCost_BU(int[][] array, int row, int col) {
        int[][] dp = new int[row + 1][col + 1];//This 2D array will store all the results. This Array has 1 extra Row and 1 extra Col
        for(int i=0; i<=col; i++) {  //Initialize default value
            dp[0][i] = Integer.MAX_VALUE;
        }
        for(int i=0; i<=row; i++) {  //Initialize default value
            dp[i][0] = Integer.MAX_VALUE;
        }
        dp[0][1] = 0; //This is done to make sure that first comparison goes through successfully
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                dp[i][j] = Integer.min(dp[i-1][j],dp[i][j-1]) + array[i-1][j-1];
            }
        }//end of loop
        return dp[row][col];
    } // end of method




}
