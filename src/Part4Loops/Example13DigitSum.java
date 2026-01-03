package Part4Loops;
import java.util.Scanner;
public class Example13DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /=10;
        }
        System.out.println("Tổng các chữ số = " +sum);
    }
}

