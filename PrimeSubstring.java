import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'maximumPrime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
    public static boolean isPrime(int num){
        if(num==0 || num==1) return false;
        
        if(num%2==0) return false;
        
        for(int i=3;i<=Math.sqrt(num);i=i+2){
            if(num%i==0) return false;
        }
        
        return true;
    }
    
    public static void findMaxPrimeSubsequence(ArrayList<String> arr, String num, int first, String s){
        if(first==num.length()){
            return;
        }
        for(int i=first;i<num.length();i++){
            if(s.length()==0 && num.charAt(i)=='0') continue;
            arr.add(s+num.charAt(i));
            findMaxPrimeSubsequence(arr, num, i+1, s+num.charAt(i));
        }
    }

    public static int maximumPrime(int n) {
    // write your code here
        ArrayList<String> arr = new ArrayList<>();
        findMaxPrimeSubsequence(arr, Integer.toString(n), 0,"");
        int max = -1;
        for(String i : arr){
            if(isPrime(Integer.parseInt(i)) && Integer.parseInt(i)>max){
                max = Integer.parseInt(i);
            }
        }
        // System.out.println(arr);
        return max;

    }

}

public class PrimeSubstring {
    public static void main(String[] args)  {
        int n = 50678;
        Result obj = new Result();
        System.out.println(obj.maximumPrime(n));
    }
}
