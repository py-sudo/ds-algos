public class HouseThief {
    /*
    there are n houses in a line
		* a thief is going to steal the maximal value of these houses
		* but he cannot steal adjacent houses
		* what is the maximum stolen value?
     */


    public static int maxValue(int index, int value[]){
        if(index >= value.length){
            return 0;
        }
        int stealCurrentHouse = value[index] + maxValue(index+2,value);
        int skippCurrentHouse = maxValue(index+1,value);

        return Math.max(stealCurrentHouse,skippCurrentHouse);
    }

    public static int maxValue_TD(int index,int value[]){
        int arr[] = new int[value.length];
        return topDown(arr,index,value);
    }

    private static int topDown(int dp[],int index,int value[]){

        if(index>=value.length)
            return 0;

        if(dp[index]==0){
            int stealCurrentHouse = value[index] + topDown(dp,index+2,value);
            int skippCurrentHouse = topDown(dp,index+1,value);
            dp[index] = Math.max(skippCurrentHouse,stealCurrentHouse);
        }

        return dp[index];
    }


    public static int maxValue_BU(int value[]){
        int dp [] = new int[value.length+2] ; // dp length extended for calculating the last house;

        for(int i=value.length-1;i>=0;i--){
            dp[i] = Math.max(value[i]+dp[i+2],dp[i]);
        }

        return dp[0];
    }


}
