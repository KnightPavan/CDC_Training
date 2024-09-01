
public class MergeSort {
    
    public static int[] mergeSort(int[] arr, int left, int right){
        int mid = (left+right)/2;
        if(left==right){
            return new int[] {arr[left]};
        }
        int[] arr1 = mergeSort(arr, left, mid);
        int[] arr2 = mergeSort(arr, mid+1, right);
        return mergeArray(arr1, arr2);
        // int[] arr2 = mergeSort(arr);
    }
    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                temp[k] = arr1[i];
                i++;
                k++;
            }else{
                temp[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i<arr1.length){
            temp[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            temp[k] = arr2[j];
            j++;
            k++;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {756,543,901,847,967,40,271,544};
        
        int[] newArr= mergeSort(arr, 0, arr.length-1);

        for(int i: newArr){
            System.out.println(i);
        }

    }
}
