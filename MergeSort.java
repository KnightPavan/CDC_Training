
public class MergeSort {
    public static void merge(int[] arr, int left, int right, int mid){

        int n1 = mid-left+1;
        int n2 = right - mid;


        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i=0;i<n1;i++){
            L[i] = arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[mid+1+j];
        }

        int i=0, j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = L[j];
            j++;
            k++;
        }


    }
 
    
    public static void mergeSort(int[] arr, int left, int right){
        if(left<right){
            int mid = (right+left)/2;
            System.out.print("here");
            mergeSort(arr, left, mid);
            System.out.println("mid: " + (mid+1) + " " + right);
            mergeSort(arr, mid+1, right);
            // System.out.println(arr[left]);
            merge(arr, left, right, mid);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,1};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
