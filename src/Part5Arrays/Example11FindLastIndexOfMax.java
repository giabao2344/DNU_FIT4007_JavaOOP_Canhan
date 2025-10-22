package Part5Arrays;
import java.util.Scanner;

public class Example11FindLastIndexOfMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        int max = a[0], index = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] >= max) {
                max = a[i];
                index = i;
            }
        }

        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Chỉ số của phần tử lớn nhất cuối cùng: " + index);
    }
}

