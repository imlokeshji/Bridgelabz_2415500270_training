import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        int i = 0;
        while (i < power) {
            result = result * num;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
