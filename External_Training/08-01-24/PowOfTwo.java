package External_Training;

class PowOfTwo{
    public static int pow(int n){
        if(n==1) return 2;

        return 2*pow(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(pow(n));
    }
}