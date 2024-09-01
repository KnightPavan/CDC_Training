import java.util.Arrays;

public class ClimbingStairs {
    public static int climbStairs(int n, int[] arr){
        if(n==0) {
            return 1;
        }
        if(n<0) return 0;

        if(arr[n]!=-1){
            return arr[n];
        }

        arr[n] = climbStairs(n-1, arr) + climbStairs(n-2, arr);
        return arr[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        System.out.println(climbStairs(n, arr));
    }
}
