import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int greatestFactor = 1;
        for (int i = num - 1; i > 0; i--) {
            if (num % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest Factor: " + greatestFactor);
    }
}
