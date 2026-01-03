package Part2ConditionalStatements;
import java.util.Scanner;
public class Example13CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("Chuỗi a và b giống nhau");
        } else {
            System.out.println("Chuỗi a và b không giống nhau");
        }
    }
}