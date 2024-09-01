import java.io.*;
import java.util.*;

public class AddTwoBinary {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        // String a = sc.next();
        // String b = sc.next();
        String a = "11";
        String b = "1";
        String ans = "";
        int i=a.length()-1;
        int j=b.length()-1;
        int carry = 0;
        while(i>=0||j>=0){
            int sum = carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            ans+=sum%2;
            carry=sum/2;
            i--;
            j--;
        }
        if(carry!=0) ans+=carry;
        
        char[] arr = ans.toCharArray();
        int l = 0;
        int k = arr.length-1;
        while(l<k){
            char temp = arr[l];
            arr[l] = arr[k];
            arr[k] = temp;
            l++;
            k--;
        }
        System.out.println(String.valueOf(arr));
        
    }
}