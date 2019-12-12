public class ZeroOneKnapsack {

    /*
     given weights and profits of N items
		* we can put items in knapsack with capacity C
		* we cannot break item into fractional
		* challenge is to find the maximum profit from the items in the knapsack
     */


    public static int maxProfit(int profit[],int weight[],int currentIndex,int capacity){

        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profit.length)//Base case
            return 0;

        int takeCurrentProfit = 0;

        if(weight[currentIndex]<=capacity){
            takeCurrentProfit = profit[currentIndex] + maxProfit(profit,weight,currentIndex+1,capacity-weight[currentIndex]);
        }

        int skipCurrentItemProfit = maxProfit(profit,weight,currentIndex+1,capacity);

        return Math.max(takeCurrentProfit,skipCurrentItemProfit);

    }


    public  int maxProfit_TD(int profit[],int weight[],int currentIndex,int capacity){
        Integer[][] dp = new Integer[profit.length][capacity + 1];
        return this.topDown(profit,weight,currentIndex,capacity,dp);
    }

    private int topDown(int profit[],int weight[],int currentIndex,int capacity,Integer dp[][]){

        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profit.length)//Base case
            return 0;
        if(dp[currentIndex][capacity]!=null)
            return dp[currentIndex][capacity];

        int takeCurrentProfit = 0;

        if(weight[currentIndex]<=capacity){
            takeCurrentProfit = profit[currentIndex] + maxProfit(profit,weight,currentIndex+1,capacity-weight[currentIndex]);
        }

        int skipCurrentItemProfit = maxProfit(profit,weight,currentIndex+1,capacity);

        dp[currentIndex][capacity] = Math.max(takeCurrentProfit,skipCurrentItemProfit);


        return dp[currentIndex][capacity];
    }



    public int maxProfit_BU(int[] profits, int[] weights, int capacity) {
        if (capacity <= 0 || profits.length == 0 || weights.length != profits.length)  //Base case
            return 0;

        int numberOfRows = profits.length + 1;// adding a dummy row to avoid array index issues

        int[][] dp = new int[numberOfRows][capacity + 1];// Create a 2D Array to store all the results

        for (int i = 0; i < numberOfRows; i++) { // Insert 0 in 1st column as it is dummy column to avoid array index issues
            dp[i][0] = 0;
        }

        for (int i = 0; i <= capacity; i++) {// Insert 0 in last row as it is dummy column to avoid array index issues
            dp[numberOfRows - 1][i] = 0;
        }

        for (int row = numberOfRows - 2; row >= 0; row--) {
            for (int column = 1; column <= capacity; column++) {
                int profit1 = 0, profit2 = 0;
                if (weights[row] <= column) { // column represents current capacity
                    profit1 = profits[row] + dp[row + 1][column - weights[row]];  // Taking current element
                }
                profit2 = dp[row + 1][column]; // Not taking current element
                dp[row][column] = Math.max(profit1, profit2);
            }
        }//end of loop
        return dp[0][capacity];
    }// end of method


}
