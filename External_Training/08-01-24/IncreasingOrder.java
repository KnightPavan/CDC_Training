package External_Training;

public class IncreasingOrder {

    public static void incOrder(int i, int n){
        if(i==n) return;

        System.out.println(i+1);
        incOrder(i+1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        incOrder(0,n);
    }
}
