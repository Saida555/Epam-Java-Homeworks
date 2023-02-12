package Arrays;

public class GreaterThanPrevious {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 6, 8, 9, 4, 5};
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                counter++;
        }
        System.out.println(counter);
    }
}
