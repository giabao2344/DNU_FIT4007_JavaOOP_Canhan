package Part4Loops;
import java.util.Scanner;
public class Example14PrintCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++)
            System.out.println(name.charAt(i));
    }
}

