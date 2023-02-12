package Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 3, 8, 5, 9, 4};
        boolean noPrimeNumber = true;
        for (int j = 0; j < arr.length; j++) {
            boolean isPrime = true;
            for (int i = 2; i <= arr[j] / 2; i++) {
                if (arr[j] % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(arr[j] + " is prime number.");
                noPrimeNumber = false;
            }
        }
        if (noPrimeNumber) {
            System.out.println("There is no prime number!");
        }
    }
}
