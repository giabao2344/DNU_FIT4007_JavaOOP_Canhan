package Part5Arrays;
import java.util.Scanner;
public class Example01FixedArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Nhập 5 số nguyên:");
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
