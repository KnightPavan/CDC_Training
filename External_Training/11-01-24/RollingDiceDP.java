public class RollingDiceDP {
    public static int rollingDice(int sum, int n, int[] dp){
        if(sum==n) return 1;
        if(sum>n) return 0;

        if(dp[sum]!=0) return dp[sum];

        int count = 0;
        for(int i=1;i<=6;i++){
            count += rollingDice(sum+i, n, dp);
        }
        dp[sum] = count;
        return dp[sum];
        
        
    }
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];
        System.out.println(rollingDice(0, n, arr));
    }
}
