package Part3SwitchCase;
import java.util.Scanner;
public class Example02GenderCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên chỉ giới tính 1 người(0-2): ");
        int N = sc.nextInt();
        if (N < 0 || N > 2){
            System.out.print("Vui lòng nhập lại số trong khoảng 0 den 2: ");
        } else {
            switch (N) {
                case 0: System.out.println("Nam"); break;
                case 1: System.out.println("Nữ"); break;
                case 2: System.out.println("Khác"); break;
            }
        }
    }
}

