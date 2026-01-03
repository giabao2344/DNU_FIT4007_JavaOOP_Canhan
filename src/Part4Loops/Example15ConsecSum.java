package Part4Loops;
import java.util.Scanner;
public class Example15ConsecSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i * (i + 1);
        }

        System.out.println("Tổng = " + sum);
    }
}
