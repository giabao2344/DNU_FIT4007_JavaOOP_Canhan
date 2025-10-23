package Part5Arrays;
import java.util.Scanner;
public class Example04SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mảng in ngược: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
