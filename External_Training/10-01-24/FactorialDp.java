import java.util.*;

public class FactorialDp {
    public static int fact(int n, int[] arr){
        if(n==0) return 1;
        if(arr[n]!=-1) return arr[n];

        arr[n] = n*fact(n-1, arr);
        return arr[n];
    }
    public static void main(String[] args) {
        int n=5;
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        System.out.println(fact(n, arr));
    }
}
