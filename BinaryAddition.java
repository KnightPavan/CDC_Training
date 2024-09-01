public class BinaryAddition {
    public static void main(String[] args) {
        String bin1 = "0011";
        String bin2 = "0001";

        System.out.println(Integer.toBinaryString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2)));
    }
    
}
