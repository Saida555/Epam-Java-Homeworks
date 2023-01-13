import java.util.Arrays;

public class NegativeIntoPositive {
    public static void main(String[] args) {
        int[] arr1 = {1, 6, -7, 3, -4, 0};
        int counter1 = 0;
        int counter2 = 0;

        for (int j = 0; j < arr1.length; ++j) {
            if (arr1[j] < 0) {
                arr1[j] = arr1[j] * (-1);
                counter1++;
            }
        }
        for (int i = 0; i < arr1.length - counter1; ++i) {
            if (arr1[i] >= 0) {
                ++counter2;
            }
        }
        for (int k = 0; k < arr1.length; ++k) {
            System.out.println(arr1[k]);
        }
        System.out.println("The number of changes is " + counter1 + ".");
        System.out.println("The number of non negative numbers in original array is " + counter2 + ".");
    }
}
