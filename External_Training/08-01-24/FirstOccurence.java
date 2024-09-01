package External_Training;

class FirstOccurence{
    public static int firstOccurence(int[] arr, int k, int i){
        if(i>=arr.length) return -1;
        if(arr[i]==k) return i;

        return firstOccurence(arr, k, i+1);
    }
    public static void main(String[] args) {
        int k=1;
        int arr[] = {1,2,3,4,5};
        System.out.println(firstOccurence(arr, k, 0));
    }

    
}