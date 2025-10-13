package part1basicvariables;

import java.util.Scanner;
public class Example12ValueExchangeWithoutDependentVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sau khi hoán đổi: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}