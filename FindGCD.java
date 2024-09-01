// // import java.io.*;
// // import java.util.*;

// // class FindGCD  {

// // 	public static int findGCD(int a, int b){

// // 		if(b==0){
// // 			return a;
// // 		}
// // 		System.out.println(a + " " + (a%b));
// // 		return findGCD(b, a%b);
// // 	}

// // 	public static void main(String args[]) {
// // 		Scanner sc = new Scanner(System.in);
// // 		int n = sc.nextInt();		
// // 		int[] arr = new int[n];
// // 		for(int i=0;i<n;i++){
// // 			arr[i] = sc.nextInt();
// // 		}
// // 		if(arr.length==1){
// // 			System.out.println(arr[0]);
// // 		}

// // 		// Arrays.sort(arr);

// // 		System.out.println(findGCD(arr[0], arr[arr.length-1]));



// // 	}
// // }

import java.io.*;
import java.util.*;

// class FindGCD  {
// 	public static void main(String args[]) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int d = sc.nextInt();

// 		for(int i=0;i<=n;i++){
			
// 			if(i==0 && i==d){
// 				System.out.print(i+" ");
// 			}

// 			int temp = i;
// 			while(i!=0){
// 				int digit = i%10;
// 				i = i/10;
// 				System.out.println(digit);
// 				if(digit==d){
// 					// System.out.print(temp+" ");
// 					break;
// 				}
				
// 			}
// 		}		
		
		
// 	}
// }

import java.util.Scanner;

public class FindGCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of groups
        int m = scanner.nextInt(); // Maximum capacity of the bus

        int[] groups = new int[n];
        for (int i = 0; i < n; i++) {
            groups[i] = scanner.nextInt(); // Number of people in each group
        }

        int buses = 0;//2
        int currentCapacity = 0; //2

        for (int group : groups) {
            if (currentCapacity + group <= m) {
                currentCapacity += group;
            } else {
                buses++;
                currentCapacity = group;
            }
        }

        buses++; // The last group will also require a bus

        System.out.println(buses);
    }
}