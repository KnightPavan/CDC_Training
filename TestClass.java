import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] arr = word.split(" "); 
        String rev = "";
        for(int i=arr.length-1;i>=0;i--){
            rev += arr[i];
            if(i!=0) rev += " ";
        }
        System.out.println(rev);
    }
}
