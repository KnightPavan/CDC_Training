import java.io.*;

class Solution {
    public int myAtoi(String str) {
        
        final int len = str.length();
        
        if(len == 0){
            return 0;
        }
        
        int index = 0;
        while(index < len && str.charAt(index) == ' '){
            index++;
        }
        
        if(index == len){
            return 0;
        }
        
        char ch;
        boolean isNegative = (ch = str.charAt(index)) ==  '-';
        
        if(isNegative || ch == '+'){
            ++index;
        }
            
        final int maxLimit = Integer.MAX_VALUE / 10;
        int result = 0;
        while(index < len && isDigit(ch = str.charAt(index))){
            
            int digit = ch - '0';
            
            if(result > maxLimit || (result == maxLimit && digit > 7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            result = (result * 10) + digit;
            
            ++index;
        }
        
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        Solution sc = new Solution();
        System.out.println(sc.myAtoi("Hello12435")); 
    }
    
    private boolean isDigit(char ch){
        return ch >= '0' && ch <= '9';
    }
}