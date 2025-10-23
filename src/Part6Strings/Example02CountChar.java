package Part6Strings;
import java.util.Scanner;
public class Example02CountChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') count++;
        }
        System.out.println("Số ký tự 'a' trong chuỗi là: " + count);
    }

}
