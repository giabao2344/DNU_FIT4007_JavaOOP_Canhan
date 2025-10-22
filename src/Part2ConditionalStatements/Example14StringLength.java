package Part2ConditionalStatements;
import java.util.Scanner;
public class Example14StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        if (a.length() > b.length()) {
            System.out.println("Chuỗi dài hơn là: " + a);
        } else if (a.length() < b.length()) {
            System.out.println("Chuỗi dài hơn là: " + b);
        } else {
            System.out.println("Hai chuỗi bằng nhau về độ dài. In ra chuỗi a: " + a);
        }
    }
}

