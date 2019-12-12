public class LongestPalindromicSubstring {




    public int findLPSubstr(String s,int startIndex, int endIndex){

        if(startIndex>endIndex)
            return 0;
        if(startIndex==endIndex)
            return 1;

        int c1 =0;
        if(s.charAt(startIndex)==s.charAt(endIndex)){
            int remain = endIndex - startIndex - 1;

            if(remain==findLPSubstr(s,startIndex+1,endIndex-1))
                c1 = 2 + remain;
        }

        int c2 = findLPSubstr(s,startIndex+1,endIndex);
        int c3 = findLPSubstr(s,startIndex,endIndex-1);

        return Math.max(c1,Math.max(c2,c3));

    }

    public int findLPSubstr_TD(String s,int startIndex, int endIndex){

        int dp[][] = new int[s.length()][s.length()];

        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[i].length;j++)
                dp[i][j]=-1;

        return this.topDown(s,startIndex,endIndex,dp);

    }

    private int topDown(String s,int startIndex, int endIndex,int dp[][]){


        if(startIndex>endIndex)
            return 0;
        if(startIndex==endIndex)
            return 1;

        int c1 =0;

        if(dp[startIndex][endIndex]==-1){ // previously not solved
            if(s.charAt(startIndex)==s.charAt(endIndex)){
                int remain = startIndex - endIndex - 1;
                if(remain==topDown(s,startIndex+1,endIndex-1,dp)){
                    c1 = 2 + remain;
                }
            }
            int c2 = topDown(s,startIndex+1,endIndex,dp);
            int c3 = topDown(s,startIndex,endIndex-1,dp);

            dp[startIndex][endIndex] = Math.max(c1,Math.max(c2,c3));
        }

        return dp[startIndex][endIndex];

    }


    public int findLPSubstr_TD(String s){

        int dp[][] = new int[s.length()][s.length()];


        for(int col=0;col<s.length();col++){
            for(int row=s.length()-1;row>=0;row++){
                if(row>col)
                    dp[row][col] = 0;
                else if(row==col)
                    dp[row][col] = 1;
                else{

                    if(s.charAt(row)==s.charAt(col)){
                        int stringLengthToBeUsed =0;
                        int expectedSubstringLength = col - row - 1;
                        if(expectedSubstringLength == dp[row+1][col-1])
                            stringLengthToBeUsed = 2 + expectedSubstringLength;


                        dp[row][col] = Math.max(stringLengthToBeUsed,Math.max(dp[row+1][col],dp[row][col+1]));

                    }else{
                        dp[row][col] = Math.max(dp[row+1][col],dp[row][col+1]);
                    }

                }



            }
        }

        return dp[0][s.length()-1];

    }


}
