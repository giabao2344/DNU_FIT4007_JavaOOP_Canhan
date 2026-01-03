package Part4Loops;
import java.util.Scanner;
public class Example12CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        boolean prime = true;
        if (N < 2) prime = false;
        else {
            for (int i = 2; i * i <= N; i++)
                if (N % i == 0) {
                    prime = false;
                    break;
                }
        }
        System.out.println(prime ? "Số nguyên tố" : "Không phải số nguyên tố");
    }
}

