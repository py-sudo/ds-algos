public class Fibonacci {
    public static int fab(int n){

        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return fab(n-1) + fab(n-2);
    }

    public static int fab_td(int n){

        int memory[] = new int[n+1];
        return topDown(memory,n);
    }

    private static int topDown(int memory[],int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(memory[n]==0)
            memory[n] = topDown(memory,n-1)+topDown(memory,n-2);

        return memory[n];
    }

}
