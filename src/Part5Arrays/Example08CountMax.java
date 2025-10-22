package Part5Arrays;
import java.util.Scanner;
public class Example08CountMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > max) max = a[i];

        int count = 0;
        for (int i = 0; i < n; i++)
            if (a[i] == max) count++;

        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Số lượng phần tử = max: " + count);
    }
}

