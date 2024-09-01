public class RodCutting {

    public static int rodCutting(int i, int sum, int[] prices, int max){
        int left = 1;
        int right = prices.length-2;
        while(left<right){
            // int l = Math.max(max, rodCutting(i, sum-k, prices, max));
            rodCutting(right, sum, prices, max)
            rodCutting(right, sum, prices, max)
        }
        return max;
    }

    public static void main(String[] args) {
        int size = 8;
        int[] prices = {0,5,8,9,10,17,17,20};

        System.out.println(rodCutting(1,size, prices, prices[size-1]));
    }
}
