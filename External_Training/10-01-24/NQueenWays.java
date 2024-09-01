import java.util.ArrayList;
import java.util.Collections;

public class NQueenWays{
    static int count = 0;

    public static boolean isSafe(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> t){
        for(int i=0;i<arr.size();i++){
            // if(t.get(0)){}
        }
        return false;
        
    }

    public static void nQueenWays(int n, int q, ArrayList<ArrayList<Integer>> arr ){
        if(arr.size()==n){
            count+=1;
            System.out.println(count);
            // for(int i=0;i<4;i++){
            //     System.out.print(arr.get(i).get(0)+","+arr.get(i).get(1));
            // }
            return;
        }

        for(int i=0;i<n;i++){
            ArrayList<Integer> t = new ArrayList<>();
            t.add(q);
            t.add(i);
            if(isSafe(arr, t)){
                arr.add(new ArrayList<>(t));
                t.clear();
                System.out.println(arr);
                nQueenWays(n, q+1, arr);
                arr.remove(arr.size()-1);
            }
                
        }
    }
    public static void main(String[] args) {
        int n=4;
        nQueenWays(n, 0, new ArrayList<ArrayList<Integer>>());
    }
}