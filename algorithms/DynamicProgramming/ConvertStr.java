public class ConvertStr {

    /*
     we are given s1 and s2
		* we need to convert s2 into s1 by deleting inserting or replacing chars
		* write a function count the minimum number of edit operations
     */

    public static int minOpForConvert(String str1,String str2,int p1,int p2){  //D&C

            if(p1==str1.length()){

                return str2.length()-p2;
            }

            if(p2==str2.length()){
                return str1.length()-p1;
            }


            if(str1.charAt(p1)==str2.charAt(p2)){
                //move forward with both string
                return minOpForConvert(str1,str2,p1+1,p2+1);
            }

            //delete
            int c1 = 1 + minOpForConvert(str1,str2,p1,p2+1);
            //insert
            int c2 = 1 + minOpForConvert(str1,str2,p1+1,p2);
            //replace
            int c3 = 1 + minOpForConvert(str1,str2,p1+1,p2+1);
            return Math.min(c1,Math.min(c2,c3));

    }

    public static int minOpForConvert_TD(String str1,String str2){
        int dp[][] = new int[str1.length()][str2.length()];
        return topDown(str1,str2,0,0,dp);
    }

    private static int topDown(String str1,String str2,int p1,int p2,int dp[][]){

        if(dp[p1][p2]==0){

            if(p1==str1.length()){
                return str2.length()-p2;
            }

            if(p2==str2.length()){
                return str1.length()-p1;
            }

            if(str1.charAt(p1)==str2.charAt(p2)){
                //move forward with both string
                return topDown(str1,str2,p1+1,p2+1,dp);
            }

            //delete
            int c1 = 1 + topDown(str1,str2,p1,p2+1,dp);
            //insert
            int c2 = 1 + topDown(str1,str2,p1+1,p2,dp);
            //replace
            int c3 = 1 + topDown(str1,str2,p1+1,p2+1,dp);

            dp[p1][p2] = Math.min(c1,Math.min(c2,c3));

        }

        return dp[p1][p2];
    }

    public static int minOpForConvert_BU(String str1,String str2){

        int dp[][] = new int[str1.length()+1][str2.length()+1];

        // if we have reached the end of s1,
        // then insert all the remaining characters of s2
        for(int p1=0;p1<str1.length();p1++){
            dp[p1][0]=p1;

        }
        // if we have reached the end of s2,
        // then delete all the remaining characters of s1
        for(int p2=0;p2<str2.length();p2++){
            dp[0][p2]=p2;
        }

        for(int i=1;i <= str1.length();i++){
            for(int j=1;j <= str2.length();j++){

                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{

                    int c1 = dp[i-1][j]; // delete
                    int c2 = dp[i-1][j-1];// replace
                    int c3 = dp[i][j-1];//insertion

                    dp[i][j] = Math.max(c1,Math.max(c2,c3));

                }


            }
        }

    return dp[str1.length()][str2.length()];

    }
}
