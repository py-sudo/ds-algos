public class LongestPalindromicSubsequence {
    /*
    We are given a string S
		* we need to find the LPS in given string S
		* palindromic is a string that reads the same
		* backward as well as forward and can be of odd or even length
     */


    public int findLPS(String s,int startIndex,int endIndex){

        if(startIndex>endIndex)
            return 0;
        if(startIndex==endIndex)
            return 1;

        int x = 0;
        if(s.charAt(startIndex)==s.charAt(endIndex)){
            x = 2 + findLPS(s,startIndex+1,endIndex-1);
        }

        int y = findLPS(s,startIndex+1,endIndex);
        int z = findLPS(s,startIndex,endIndex-1);

        return Math.max(x,Math.max(y,z));

    }

    public int findLPS_TD(String s,int startIndex,int endIndex){
        int dp[][] = new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[i].length;j++)
                dp[i][j]=-1;

        return this.topDown(s,startIndex,endIndex,dp);
    }

    private int topDown(String s,int startIndex,int endIndex,int[][]dp){
        if(startIndex>endIndex)
            return 0;

        if(startIndex==endIndex)
            return 1;
        int c1 = 0;
        if(dp[startIndex][endIndex]==-1){ // no computed yet
            if(s.charAt(startIndex)==s.charAt(endIndex))
                 c1 = 2 + topDown(s,startIndex+1,endIndex-1,dp);

            int c2 = topDown(s,startIndex+1,endIndex,dp);
            int c3 = topDown(s,startIndex,endIndex-1,dp);
            dp[startIndex][endIndex] = Math.max(c1,Math.max(c2,c3));
        }

        return dp[startIndex][endIndex];
    }


    public int findLPS_BU(String s){

        int dp[][] = new int[s.length()][s.length()];


        for(int col=0;col<s.length();col++){
            for(int row=s.length()-1;row>=0;row++){
                if(row>col)
                    dp[row][col] = 0;
                else if(row==col)
                    dp[row][col] = 1;
                else{

                    if(s.charAt(row)==s.charAt(col)){

                        dp[row][col] = Math.max(2 + dp[row+1][col-1],Math.max(dp[row+1][col],dp[row][col+1]));

                    }else{
                        dp[row][col] = Math.max(dp[row+1][col],dp[row][col+1]);
                    }

                }



            }
        }

        return dp[0][s.length()-1];

    }


}
