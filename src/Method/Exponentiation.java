package Method;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(exponent(5));
        System.out.println(exponent(5, 2));
    }

    public static int exponent(int number) {
        int result = 1;
        for (int i = 0; i < number; i++) {
            result *= number;
        }
        return result;
    }

    public static int exponent(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
