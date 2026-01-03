package Part2ConditionalStatements;
import java.util.Scanner;
public class Example01PrintWords {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào một số nguyên N
            System.out.print("Nhập vào một số nguyên N: ");
            int N = scanner.nextInt();

            // Kiểm tra xem N có phải là số tự nhiên không
            if (N >= 0) {
                System.out.println(N + " là số tự nhiên.");
            } else {
                System.out.println(N + " không phải là số tự nhiên.");
            }

            scanner.close();
        }
    }

