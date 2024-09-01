
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = new int[arr1.length + arr2.length];
        mergeArray(arr1, arr2, arr3);
        for(int i: arr3){
            System.out.println(i);
        }
    }

    private static void mergeArray(int[] arr1, int[] arr2,  int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
    }
}
