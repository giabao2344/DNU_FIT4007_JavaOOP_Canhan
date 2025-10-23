package Part5Arrays;
import java.util.Scanner;
public class Example05EvenAtOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            if (i % 2 != 0 && a[i] % 2 == 0)
                sum += a[i];
        }

        System.out.println("Tổng các phần tử chẵn ở chỉ số lẻ: " + sum);
    }
}
