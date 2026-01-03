package Part6Strings;
import java.util.Scanner;
public class Example05DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        boolean hasDigit = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }

        if (hasDigit)
            System.out.println("Chuỗi có chứa ký tự số.");
        else
            System.out.println("Chuỗi không chứa ký tự số.");
    }
}
