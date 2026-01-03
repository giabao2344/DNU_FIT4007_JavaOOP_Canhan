package Part4Loops;
import java.util.Scanner;
public class Example11PrintDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        System.out.println("Các ước của " + N + " là:");
        for (int i = 1; i <= N; i++)
            if (N % i == 0)
                System.out.println(i);
    }
}

