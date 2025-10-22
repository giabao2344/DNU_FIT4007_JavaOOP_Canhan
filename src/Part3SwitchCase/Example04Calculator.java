package Part3SwitchCase;
import java.util.Scanner;
public class Example04Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char pt = sc.next().charAt(0);

        switch (pt) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Lỗi: không thể chia cho 0!");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println(a + " % " + b + " = " + (a % b));
                } else {
                    System.out.println("Lỗi: không thể chia cho 0!");
                }
                break;
            default:
                System.out.println("Phép tính không hợp lệ!");
        }
    }
}
