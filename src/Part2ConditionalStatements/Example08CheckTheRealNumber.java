package Part2ConditionalStatements;
import java.util.Scanner;

public class Example08CheckTheRealNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập một số thực: ");
            float a = sc.nextFloat();
            if (a == (int)a) {
                System.out.println(a + " là số nguyên");
            } else {
                System.out.println(a + " không phải là số nguyên");
            }
        }
    }

