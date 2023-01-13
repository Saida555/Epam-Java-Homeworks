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

    //char[] chars = {'1','2','3'};
    // int [] counter = new int [1];
    // Scanner input = new Scanner (System.in);
    // System.out.println("enter");
    //// char c = input.next().charAt(0);
    // int i = 0;
    //// while(i < chars.length){
    //   if (chars[c] ==counter[i] )
    //   System.out.println(i);
}
// char[] array = {'S', 'A', 'I', 'D', 'A' };
// Scanner input = new Scanner (System.in);
// char c = input.next().charAt(0);

// int i = 0;
//  int counter = 0;
//   while( c == array[i]){
//       System.out.println(counter);
//     i++;
//  counter++;
// }
// }


