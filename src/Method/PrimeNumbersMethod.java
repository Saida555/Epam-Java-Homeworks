package Method;

public class PrimeNumbersMethod {
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 3, 8, 5, 9, 4};
        boolean noPrimeNumber = true;
        for (int j = 0; j < arr.length; j++) {
            if (isPrime(arr[j])) {
                System.out.println(arr[j] + " is prime number.");
                noPrimeNumber = false;
            }
        }
        if (noPrimeNumber) {
            System.out.println("There is no prime number!");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
