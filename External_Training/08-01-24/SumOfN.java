package External_Training;

public class SumOfN {

    public static int sumOfN(int n){
        if(n==1) return 1;

        return n+sumOfN(n-1);
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(sumOfN(n));
    }
}
