package Arrays;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1, 1, 1, 1, 0, 1, 0, 1, 1, 1};
        int decimalNumber = 0;
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            decimalNumber = decimalNumber + arr[i] * counter;
            counter = counter * 2;
        }
        System.out.println("Decimal number is " + decimalNumber);
    }
}
