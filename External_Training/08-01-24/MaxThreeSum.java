package External_Training;

public class MaxThreeSum {
    public static void main(String[] args) {
        int arr[] = {5,4,3,10,1};
        bubbleSort(arr);
        if(arr.length<3){
            System.out.println("Not possible");
            return;
        }
        int sum = 0;
        for(int i=arr.length-3;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Max sum "+sum);

    }

    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
