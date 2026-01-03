package part1basicvariables;

import java.util.Scanner;
public class Example09Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b (khác 0): ");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("Không thể chia cho 0!");
        } else {
            double KQ = (double) a / b;
            System.out.println(a + " / " + b + " = " + KQ);
        }
    }
}