package part1basicvariables;
import java.util.Scanner;
public class Example05CheckYearOfBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi của sinh viên: ");
        int a = sc.nextInt();
        int b = 2023 - a;
        System.out.println("Năm sinh của sinh viên là: " + b);
    }
}

