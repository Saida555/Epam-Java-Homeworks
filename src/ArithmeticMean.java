public class ArithmeticMean
{
    public static void main(String[] args) {
                int x;
                int y;
                x = 51;
                y = 5;
                int z;
                z = x - y * (x / y);
                boolean bool1 = true;
                boolean bool2 = false;

                if (z == 0) {
                    System.out.println(bool1);
                } else{
                    System.out.println(bool2);

                    //--------------------------------------------//
                    int a, b, c, d, e, f;
                    a = 1;
                    b = 2;
                    c = 4;
                    d = 5;
                    e = 6;
                    f = 8;
                    double mean1 = ((double) (a + b + c)) / 3;
                    double mean2 = ((double) (d + e + f)) / 3;
                    int sum = ((int) (mean1 + mean2));

                    System.out.println("The sum of arithmetic means is  " + sum);
                }
            }
        }
