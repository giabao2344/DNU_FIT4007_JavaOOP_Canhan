package Part6Strings;
import java.util.Scanner;
public class Example06CheckPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] seen = new boolean[26];
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') seen[c - 'a'] = true;
        }

        boolean isPangram = true;
        for (boolean b : seen) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        if (isPangram)
            System.out.println("Chuỗi là Pangram.");
        else
            System.out.println("Chuỗi không phải Pangram.");
    }
}

