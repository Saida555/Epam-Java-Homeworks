package PrimitiveTypes;

public class SumOfSquares {
    public static void main(String[] args)
            {
                int c;
                int a = 5;
                int b = 7;
                c = (a * a) + (b * b);

                System.out.println("Sum of squares of a and b is " + c);
                //--------------------------------------------------//

                int s;
                a = 7;
                b = 9;
                c = 5;
                s = ((a + b) / 2) * c;
                System.out.println("The area of trapezoid is " + s);

                //--------------------------------------------------//

                int number;
                number = 567;
                int digit1 = number / 100;
                int digit2 = (number % 100)/10;
                int digit3 = number % 10;
                System.out.println(digit1);
                System.out.println(digit2);
                System.out.println(digit3);
            }}


