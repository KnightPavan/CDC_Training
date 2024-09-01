package External_Training;

public class LinearSearch {
    public static void main(String args[])
    {
    int k=7;
    int arr[] = {1,2,3,4,5};
    for(int i=0;i<arr.length;i++){
        if(arr[i]==k){
            System.out.println("Found at "+i);
            return;
        }
    }
    System.out.println("Not found");}
}
