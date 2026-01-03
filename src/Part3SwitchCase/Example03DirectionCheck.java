package Part3SwitchCase;
import java.util.Scanner;
public class Example03DirectionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một ký tự (N, S, E, W): ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'N': System.out.println("Bắc"); break;
            case 'S': System.out.println("Nam"); break;
            case 'E': System.out.println("Tây"); break;
            case 'W': System.out.println("Đông"); break;
            default: System.out.println("Ký tự không hợp lệ. Vui lòng nhập N, S, E hoặc W");
        }
    }
}

