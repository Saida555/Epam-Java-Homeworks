package ScannerClass;

import java.util.Scanner;
public class PossibleTriangle
{
    public static void main(String[] args)
    {
                Scanner sidesOfTriangle = new Scanner(System.in);
                System.out.print("Input first side: ");
                int a = sidesOfTriangle .nextInt();
                System.out.print("Input second side: ");
                int b = sidesOfTriangle .nextInt();
                System.out.print("Input third side: ");
                int c = sidesOfTriangle .nextInt();
                 if (a <= 0 || b <= 0 || c <= 0)
                 {
                     System.out.println("One (or more) of entered triangle sides is not positive!");
                 }
                 else if (a + b > c && b + c > a && c + a > b)
                 {
                     System.out.println("It is possible to get a triangle with the entered sides.");
                 }
                 else
                 {
                     System.out.println("It isn't possible to get a triangle with the entered sides.");
                 }
    }
}
