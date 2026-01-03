package Part2ConditionalStatements;
import java.util.Scanner;
public class Example12Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " là chữ cái in hoa");
        } else {
            System.out.println(ch + " không phải là chữ cái in hoa");
        }
    }
}
