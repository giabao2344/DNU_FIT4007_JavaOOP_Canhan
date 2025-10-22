package Part2ConditionalStatements;
import java.util.Scanner;
public class Example15NextMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giờ (0-23): ");
        int h = sc.nextInt();
        System.out.print("Nhập phút (0-59): ");
        int m = sc.nextInt();

        System.out.println("Thời gian hiện tại: "+ h + ":" + m);

        // Tăng thêm 1 phút
        m++;
        if (m == 60) {
            m = 0;
            h++;
            if (h == 24) {
                h = 0;
            }
            System.out.println("Thời gian sau 1 phút: " + h + ":" + m);
        } else {
            System.out.println("Thời gian không hợp lệ");
        }

    }
}

