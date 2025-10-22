package Part3SwitchCase;
import java.util.Scanner;
public class Example01ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số N (0-9): ");
        int N = sc.nextInt();
        if (N < 0 || N > 9) {
            System.out.print("Vui lòng nhập số trong khoảng 0 đến 9");
        } else {
            switch (N) {
                case 0: System.out.println("Không"); break;
                case 1: System.out.println("Một"); break;
                case 2: System.out.println("Hai"); break;
                case 3: System.out.println("Ba"); break;
                case 4: System.out.println("Bốn"); break;
                case 5: System.out.println("Năm"); break;
                case 6: System.out.println("Sáu"); break;
                case 7: System.out.println("Bảy"); break;
                case 8: System.out.println("Tám"); break;
                case 9: System.out.println("Chín"); break;
            }
        }
    }
}

