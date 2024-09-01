public class CombinationOfN {
    static int count = 0;
    public static void printCombination(int[] arr, int n,int k, String str, int lim){
        if(str.length()==k){
            System.out.println(++count+ ". " + str);
            return;
        }

        for(int i=lim;i<=arr.length;i++){
            System.out.println(str + " . " + i + " . " + lim);
            printCombination(arr, n, k, str+i, i+1);
        }
        // for(int i=lim;i<arr.length;i++){
        //     printCombination(arr, n, k, str+arr[i], i+1);
        // }
    }
    public static void main(String[] args) {
        int n=4;
        int k=2;
        int[] arr = {1,2,3,4};
        printCombination(arr, n, k,"",1);
    }
}
