public class RollingDice {
    // static int count = 0;
    public static int rollingDice(int sum, int n){
        if(sum==n) return 1;
        if(sum>n) return 0;

        int count = 0;
        for(int i=1;i<=6;i++){
            count += rollingDice(sum+i, n);
        }
        return count;
        
        
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(rollingDice(0, n));
    }
}
