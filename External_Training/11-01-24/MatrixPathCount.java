public class MatrixPathCount{

    public static int matrixPathCount(int er, int ec, int[][] dp, int cr, int cc){

        if(cr==er && cc==ec) return 1;
        if(cr>er || cc>ec) return 0;

        if(dp[cr][cc]!=-1) {
            System.out.println("here");
            return dp[cr][cc];
        }

        dp[cr][cc] =  matrixPathCount(er, ec, dp, cr, cc+1) + matrixPathCount(er, ec, dp, cr+1, cc);
        
        return dp[cr][cc];
        
    }

    public static void main(String[] args) {
        int n=3;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = -1;
            }
        }

        System.out.println(matrixPathCount(n-1,n-1,arr, 0, 0));
    }
}