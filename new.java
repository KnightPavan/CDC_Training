import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int num){
        if(num==2) return true;
        if(num%2==0) return false;
        
        for(int i=3;i<=Math.sqrt(num);i=i+2){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void generatePrime(ArrayList<Integer> arr , int num){
        for(int i=2;i<num;i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        generatePrime(arr, num);
        // for(int i : arr){
        //     System.out.println(i);
        // }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.size();i++){
            set.add(arr.get(i));
        }
        int res = 0;
        for(int i=4;i<=num;i=i+2){
            int count = 0;
            for(int j=0;j<arr.size();j++){
                if(i%arr.get(j)==0){
                    count++;
                }
            }
            if(count==2){
                res++;
            } 
        }
        System.out.println(res);
            
    }
}