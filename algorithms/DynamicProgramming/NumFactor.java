public class NumFactor {

    /*
    given N, count the number of ways to express N as sum of 1,3,4
    {1,3,4}
     */


    public static int calNumFactor_DC(int n){

        if(n==0|| n==1||n==2){
            return 1;   // {} {1} {11}
        }

        if(n==3){
            return 2; //{111} {3}
        }

        int sub1 = calNumFactor_DC(n-1);
        int sub2 = calNumFactor_DC(n-3);
        int sub3 = calNumFactor_DC(n-4);

        return sub1+sub2+sub3;

    }



    public static int calNumFactor_TD(int n){

        int []dp = new int[n+1]; // initialized element to 0 by default
        return topDown(dp,n);

    }

    private static int topDown(int[]dp,int n){

        if(n==0|| n==1||n==2){
            return 1;   //{} {1} {11}
        }

        if(n==3){
            return 2; //{111} {3}
        }

        if(dp[n]==0){
            int sub1 = calNumFactor_TD(n-1);
            int sub2 = calNumFactor_TD(n-3);
            int sub3 = calNumFactor_TD(n-4);
            dp[n] = sub1+sub2+sub3;
        }

        return dp[n];
    }


    public static int calNumFactor_BU(int n){

        int dp[] = new int[n+1];
        dp[0]=dp[1]=dp[2]=1;
        dp[3]=2;

        for(int i=4;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-3] + dp[i-4];
        }

        return dp[n];

    }

}
