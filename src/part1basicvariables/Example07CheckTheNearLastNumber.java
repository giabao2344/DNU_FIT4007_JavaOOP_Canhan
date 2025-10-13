package part1basicvariables;
import java.util.Scanner;
public class Example07CheckTheNearLastNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N: ");
        int N = sc.nextInt();
        if (Math.abs(N) <= 9) {
            System.out.println("N phải là số có 2 chữ số");
        }
        else {
            int Sogancuoi = Math.abs(N/10) % 10;
            System.out.println("Số gần cuối của " + N + " là: " +Sogancuoi);
        }
    }
}