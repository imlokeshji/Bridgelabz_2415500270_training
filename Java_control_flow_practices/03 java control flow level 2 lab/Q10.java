import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int greatestFactor = 1;
        int i = num - 1;
        while (i > 0) {
            if (num % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest Factor: " + greatestFactor);
    }
}
