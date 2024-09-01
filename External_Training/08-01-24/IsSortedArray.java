package External_Training;

public class IsSortedArray {
    public static boolean isSorted(int[] arr, int i){
        if(i>arr.length-2) return true;
        if(arr[i]>arr[i+1])return false;
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,7,8,10,15,20};
        System.out.println(isSorted(arr, 0)?"Sorted":"Not Sorted");
    }
}
