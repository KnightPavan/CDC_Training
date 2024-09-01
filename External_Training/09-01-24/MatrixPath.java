
public class MatrixPath {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        findPath(m-1, n-1, 0, 0, "");
    }

    public static void findPath(int vlim, int hlim, int i, int j, String str) {
        if(i==vlim && j==hlim) {
            System.out.println(str);
            return;
        }
        if(i>vlim || j>hlim) {
            return;
        }

        findPath(vlim, hlim, i, j+1, str+'H');
        findPath(vlim, hlim, i+1, j, str+'V');
        return;
    }
}
