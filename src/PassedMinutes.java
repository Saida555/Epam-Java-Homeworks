import java.util.Scanner;
public class PassedMinutes
{
    public static void main(String[] args)
    {
        Scanner minuteHandNumber = new Scanner(System.in);
        System.out.println("Enter the number of minute hand of the clock․ It must be from 1 to 12!");
        int passed_Minutes = minuteHandNumber.nextInt();
                if (passed_Minutes < 1 || passed_Minutes > 12)
                {
                    System.out.print("Please, enter correct minute hand number. It must be from 1 to 12!");
                    System.exit(0);
                }
        int[] minutes = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55,0};
        System.out.println("It's " +minutes[passed_Minutes]+ " minutes past the hour.");
    }
}
