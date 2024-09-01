// public class CoinChange {
//     static int count = 0;
//     public static void coinChange(String str, int sum, int n, int[] arr, int lim){
//         if(sum==n) {
//             System.out.println(++count +". "+str);
//         }
//         if(sum>n) return;

//         for(int i=lim;i<arr.length;i++){
//             coinChange(str+arr[i], sum+arr[i], n, arr, i);
//         }
// }
//     public static void main(String[] args) {
//         int n = 10;
//         int[] arr = {2,3,5,6};
//         coinChange("",0,n, arr, 0);
//     }
// }

public class CoinChange{
    static int count = 0;
    public static void coinChange(int[] arr, int n, int sum, String str){
        if(sum==0){
            System.out.println(++count + ". " + str);
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=sum){
                coinChange(arr, n, sum-arr[i], str+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        int n = 10;
        coinChange(arr, n, n, "");
    }
}
