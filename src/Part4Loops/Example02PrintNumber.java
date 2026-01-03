package Part4Loops;
import java.util.Scanner;
public class Example02PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}

