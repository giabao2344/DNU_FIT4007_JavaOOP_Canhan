package Part5Arrays;
import java.util.Scanner;
public class Example12DeleteAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Nhập chỉ số k (0 <= k < " + n + "): ");
        int k = sc.nextInt();

        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < n; i++) {
            if (i != k) System.out.print(a[i] + " ");
        }
    }
}

