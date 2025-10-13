package part1basicvariables;
import java.util.Scanner;
public class Example08NameLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();
        int doDai = ten.length();
        System.out.println("Tên của bạn là: " + ten);
        System.out.println("Độ dài tên của bạn là: " + doDai);
    }
}