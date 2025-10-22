package Part4Loops;
import java.util.Scanner;
public class Example05PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        System.out.println("Các số chẵn từ 1 đến " + N + ":");
        for (int i = 2; i <= N; i += 2) {
            System.out.println(i);
        }
    }
}

