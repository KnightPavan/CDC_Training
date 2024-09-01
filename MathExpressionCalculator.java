// import java.io.*;
// import java.util.*;

// class TestMicro{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//     }
// }

// import java.util.Scanner;

// public class Calculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a mathematical expression: ");
//         String expression = scanner.nextLine();

//         double result = evaluateExpression(expression);
//         System.out.println("Result: " + result);
//     }

//     public static double evaluateExpression(String expression) {
//         String[] tokens = expression.split("\\+");
//         double sum = 0;
//         for (String token : tokens) {
//             sum += Double.parseDouble(token);
//         }
//         return sum;
//     }
// }

import java.util.*;
import java.io.*;

public class MathExpressionCalculator {
    
    public static int calculate(String expression) {
        Stack<Integer> stack = new Stack<>();
        char[] chars = expression.toCharArray();
        
        int num = 0;
        char sign = '+';
        
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            
            if ((!Character.isDigit(c) && c != ' ') || i == chars.length - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                }
                sign = c;
                num = 0;
            }
        }
        
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String expression = "10+20-5";
        int result = calculate(expression);
        System.out.println("Output: " + result);
    }
}
