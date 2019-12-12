public class WaysToReachLastCell {

    /*
    num of path to reach to last cell
    */

    public int numOfPath(int arr[][],int cost,int row,int col){

        if(cost<0)
            return 0;

        if(row==0 &&col==0)
            return arr[row][col] - cost ==0 ? 1:0;

        if(row==0){
            return numOfPath(arr,cost-arr[row][col],row,col-1);
        }

        if(col==0){
            return numOfPath(arr,cost-arr[row][col],row-1,col);
        }

        int goUp = numOfPath(arr,cost-arr[row][col],row-1,col);

        int goLeft = numOfPath(arr,cost-arr[row][col],row,col-1);

        return goLeft+goUp;

    }

    public int numberOfPaths(int array[][], int row, int col, int cost) {
        int[][] dp = new int[row + 1][col + 1];
        return numberOfPathsAux(dp, array, row, col, cost);
    }// End of method


    public int numberOfPathsAux(int dp[][], int array[][], int row, int col, int cost) {
        if (cost < 0) {// BASE CASE
            return 0;
        }
        if (row == 0 && col == 0) { // BASE CASE
            return (array[0][0] - cost == 0) ? 1 : 0;
        }
        if (dp[row][col] == 0) {// If we have not solved this problem previously, only then solve it
            if (row == 0) { // BASE CASE: If we're at first row, we can only go left
                dp[row][col] = numberOfPaths(array, 0, col - 1, cost - array[row][col]);
            }
            else if (col == 0) { // BASE CASE: if we're at first column, we can only go up
                dp[row][col] = numberOfPaths(array, row - 1, 0, cost - array[row][col]);
            } else {
                int noOfPathsFromPreviousRow = numberOfPaths(array, row - 1, col, cost - array[row][col]); // Find Paths till last Row
                int noOfPathsFromPreviousCol = numberOfPaths(array, row, col - 1, cost - array[row][col]); // Find Paths till last Col
                dp[row][col] = noOfPathsFromPreviousRow + noOfPathsFromPreviousCol;
            }
        } // end of if-else block
        return dp[row][col];
    }// End of method



}
