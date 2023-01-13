import java.util.Arrays;

public class ThreeArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 1, 9, 7};
        int[] arr2 = {3, 6, 5, -3, 8};
        int[] arr3 = new int[arr1.length];
        int i, j;
        for (i = 0, j = 0; i < arr1.length; ++i) {
            if ((arr1[i] % 2 != 0) && (arr2[i] % 2 != 0)) {
                arr3[j++] = arr1[i];
            } else if ((arr1[i] % 2 == 0) && (arr2[i] % 2 == 0)) {
                arr3[j++] = arr2[i];
            } else {
                j++;
            }
        }
        for ( j = 0; j < arr1.length; j++) {
            System.out.println(Arrays.toString(arr3));
        }
    }
}
