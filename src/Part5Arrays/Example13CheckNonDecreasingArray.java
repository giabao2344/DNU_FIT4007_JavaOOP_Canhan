package Part5Arrays;
import java.util.Scanner;
public class Example13CheckNonDecreasingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean nonDecrease = true;

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                nonDecrease = false;
                break;
            }
        }

        if (nonDecrease)
            System.out.println("Mảng không giảm ");
        else
            System.out.println("Mảng không phải mảng không giảm ");
    }
}

