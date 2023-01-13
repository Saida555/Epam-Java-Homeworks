import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        char[] array = {'S', 'A', 'I', 'D', 'A' };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character!");
        char c = input.next().charAt(0);
        int i = 0;
        while (i < array.length) {
            if (array[i] == c) ;
            {
                System.out.println("The index of element " + c + " is ");
                System.out.println(new String(array).indexOf(c));
                ++i;
                break;
            }
        }
    }
}