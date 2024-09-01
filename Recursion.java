public class Recursion {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int mult = n;
        return mult*fact(n-1); 
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(fact(n));
    }
    
}
