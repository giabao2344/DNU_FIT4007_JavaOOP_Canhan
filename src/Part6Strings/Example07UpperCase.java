package Part6Strings;
import java.util.Scanner;
public class Example07UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.println("Chuỗi in hoa: " + str.toUpperCase());
    }
}

