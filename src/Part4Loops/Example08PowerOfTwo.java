package Part4Loops;
import java.util.Scanner;
public class Example08PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();
        boolean ok = true;
        int x = N;
        while (x > 1) {
            if (x % 2 != 0) {
                ok = false;
                break;
            }
            x /= 2;
        }
        System.out.println(ok ? N + " là lũy thừa của 2" : N + " không phải lũy thừa của 2");
    }
}

