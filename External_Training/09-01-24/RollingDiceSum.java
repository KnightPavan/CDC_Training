public class RollingDiceSum {
    static int count = 0;
    public static void diceSum(String str, int sum, int n){
        if(sum==n){
            count++;
            System.out.println(count+". "+str);
            
            return;
        }
        if(sum>n){
            return;
        }
        for(int i=1;i<=6;i++){
            diceSum(str+i,sum+i,n);
        }

    }
    public static void main(String[] args) {
        int n = 10; 
        diceSum("", 0, n);
    }
}
