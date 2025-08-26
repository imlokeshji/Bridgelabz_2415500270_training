import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if(year < 1582) {
            System.out.println("Year not valid");
            return;
        }
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) System.out.println("Leap Year");
                else System.out.println("Not a Leap Year");
            } else System.out.println("Leap Year");
        } else System.out.println("Not a Leap Year");

        if((year >= 1582) && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            System.out.println("Leap Year (single if condition)");
        else if(year >= 1582)
            System.out.println("Not a Leap Year (single if condition)");
    }
}