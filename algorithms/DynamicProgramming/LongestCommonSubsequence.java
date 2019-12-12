public class LongestCommonSubsequence {

/*
* we are given s1 and s2
* we need to find the length of the longest sub-sequence which is common in both the strings.
* sub-sequence is a sequence that can be derived from another sequence
* by deleting some elements without changing the order of the remain elements.
 */


    public int findLCS(String str1,String str2,int i, int j){

        if(i==str1.length()||j==str2.length())
            return 0;

        int c1=0;
        if(str1.charAt(i)==str2.charAt(j)){
            c1 = 1 + findLCS(str1,str2,i+1,j+1);
        }

        int c2 = findLCS(str1,str2,i+1,j);
        int c3 = findLCS(str1,str2,i,j+1);

        return Math.max(c1,Math.max(c2,c3));
    }


    public int findLCS_TD(String str1,String str2,int i1, int i2){
        int dp[][] = new int[str1.length()][str2.length()];

        for (int i = 0; i < str1.length(); i++) // initialize all values with '-1'
            for (int j = 0; j < str2.length(); j++)
                dp[i][j] = -1;

        return this.topDown(str1,str2,i1,i2,dp);
    }


    private int topDown(String str1,String str2,int i, int j,int [][]dp){

        if(i==str1.length()||j==str2.length())
            return 0;


        if(dp[i][j]==-1){

            if(str1.charAt(i)==str2.charAt(j)){
                dp[i][j] = 1 + findLCS(str1,str2,i+1,j+1);
                return dp[i][j];
            }else{

                int c2 = findLCS(str1,str2,i+1,j);
                int c3 = findLCS(str1,str2,i,j+1);

                dp[i][j] = Math.max(c2,c3);

            }


        }



        return dp[i][j];
    }


    public int findLCS_BU(String str1,String str2){

        int dp[][] = new int[str1.length()+1] [str2.length()+1];

        for(int i=0;i<=str1.length();i++){
            dp[i][str1.length()] = 0;
        }

        for(int i=0;i<=str2.length();i++){
            dp[str2.length()][i] = 0;
        }

        for(int i =str1.length();i>=1;i--){
            for(int j=str2.length();j>=1;j--){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    int c1 = 1 + dp[i][j];
                    int c2 = dp[i-1][j];
                    int c3 = dp[i][j-1];
                    dp[i-1][j-1] = Math.max(c1,Math.max(c2,c3));
                }else{
                    int c2 = dp[i-1][j];
                    int c3 = dp[i][j-1];
                    dp[i-1][j-1] = Math.max(c2,c3);
                }
            }
        }


    return dp[0][0];
    }


}
