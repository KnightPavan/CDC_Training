import java.util.HashSet;



public class SquareFreeNumber {

    public static boolean isDivisible(int num, HashSet<Integer> set){
        for(int i : set){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int N = 72;
        HashSet<Integer> set = new HashSet<>();
        for(int i=2;i<=Math.sqrt(N);i++){
            set.add(i*i);
        }

        for(int i=2;i<N/2;i++){
            if(N%i==0 && !(set.contains(i)) && isDivisible(i, set)){
                System.out.println(i);
            }
        }
    }
}
