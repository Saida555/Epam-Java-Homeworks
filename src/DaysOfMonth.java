import java.util.Scanner;
public class DaysOfMonth
{
    public static void main(String[] args)
    {
        Scanner monthNumber = new Scanner(System.in);
        System.out.println("Enter the number of the month for which you want to see the number of days․ It must be from 1 to 12!");
        int numberOfDays = monthNumber.nextInt();
        if (numberOfDays < 1 || numberOfDays > 12)
        {
            System.out.print("Please, enter correct month number. It must be from 1 to 12!");
            System.exit(0);
        }
        switch (numberOfDays)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("The number of days for month " + numberOfDays + " is 31.");
                break;
            case 4, 6, 9, 11:
                System.out.println("The number of days for month " + numberOfDays + " is 30.");
                break;
            case 2:
                System.out.println("The number of days for month " + numberOfDays + " is 28");
                break;
        }
    }
}