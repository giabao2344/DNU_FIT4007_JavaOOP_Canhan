package part1basicvariables;

import java.util.Scanner;
public class Example10NextCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự thường (từ a đến y): ");
        char chu = sc.next().charAt(0);
        if (chu >= 'a' && chu <= 'y') {
            char nextChu = (char) (chu + 1);
            System.out.println("Ký tự sau " + chu + " là " + nextChu);
        } else if (chu == 'z') {
            System.out.println("Không có kí tự nào sau z trong bảng chữ cái thường");
        } else {
            System.out.println("Bạn phải nhập ký tự thường từ a đến y!");
        }
    }
}