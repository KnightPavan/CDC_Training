import java.util.Arrays;

public class FriendsPairing {

    public static void main(String[] args) {
        int n =5;
        FactorialDp fp = new FactorialDp();
        int combi = n+(fp.factorial(n)/(fp.factorial(2)*fp.factorial(n-2)));
        System.out.println(combi);
    }
}

class FactorialDp {
    public static int fact(int n, int[] arr){
        if(n==0) return 1;
        if(arr[n]!=-1) return arr[n];

        arr[n] = n*fact(n-1, arr);
        return arr[n];
    }
    public static int factorial(int n) {
        // int n=5;
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        return fact(n, arr);
    }
}

// public class FriendsPairing{
//     static int count = 0;
//     public static void pairCount(String str,int first, int n){
//         if(str.length()==2 || str.length()==1){
//             count++;
//             // return 1;
//         } 

//         for(int i = first;i<=n;i++){
//             pairCount(str+i,i+1, n);
//         }
            

//     }
//     public static void main(String[] args) {
//         int n = 5;
//         pairCount("",1,n);
//         System.out.println(count);

//     }
// }
