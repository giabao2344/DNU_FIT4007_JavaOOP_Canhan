package Part6Strings;
import java.util.Scanner;
public class Example01StringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Chuỗi đảo ngược là: " + reversed);
    }
}
