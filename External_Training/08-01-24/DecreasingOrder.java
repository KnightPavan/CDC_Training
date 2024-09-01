
public class DecreasingOrder {
    public static void decOrder(int n){
        if(n==0) return;

        System.out.println(n);
        decOrder(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        decOrder(n);
    }
}
