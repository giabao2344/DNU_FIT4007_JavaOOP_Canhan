package Part7Methods;
import java.util.Scanner;

public class Example08CheckPalindromeString {
    public static boolean isPalindromeString(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase(); // bỏ khoảng trắng & đổi thường
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        System.out.println("Đối xứng: " + isPalindromeString(s));
    }
}
