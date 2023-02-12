package Arrays;

import java.util.Arrays;
public class NonNegativeNumbers
{
    public static void main(String[] args) {
        double[] inputNumbers = {5,7, -2, -3, 1};
        double[] outputNumbers = new double[inputNumbers.length];

        if (inputNumbers[0] > 0) {
            System.arraycopy(inputNumbers, 0, outputNumbers, 0, 1);
        }
        if (inputNumbers[1] > 0) {
            System.arraycopy(inputNumbers, 1, outputNumbers, 1, 1);
        }
        if (inputNumbers[2] > 0) {
            System.arraycopy(inputNumbers, 2, outputNumbers, 2, 1);
        }
        if (inputNumbers[3] > 0) {
            System.arraycopy(inputNumbers, 3, outputNumbers, 3, 1);
        }
        if (inputNumbers[4] > 0) {
            System.arraycopy(inputNumbers, 4, outputNumbers, 4, 1);
        }
        System.out.println(Arrays.toString(outputNumbers));
    }
}