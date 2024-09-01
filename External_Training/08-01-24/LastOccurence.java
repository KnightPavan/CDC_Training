package External_Training;

public class LastOccurence {
    public static int lastOccurence(int[] arr, int k, int i){
        if(i<0) return -1;
        if(arr[i]==k) return i;

        return lastOccurence(arr, k, i-1);
    }
    public static void main(String[] args) {
        int k=2;
        int arr[] = {1,2,3,2,5};
        System.out.println(lastOccurence(arr, k, arr.length-1)==-1?"Not found":"found At " + lastOccurence(arr, k, arr.length-1));
    }
}
