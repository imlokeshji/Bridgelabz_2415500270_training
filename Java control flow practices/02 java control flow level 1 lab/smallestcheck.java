import java.util.Scanner;
public class smallestcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2=sc.nextInt();
        System.out.print("Enter the third number: 3");
        int number3=sc.nextInt();

        if(number1 <= number2 && number1 <= number3){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }

    }
}
