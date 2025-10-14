package Part2ConditionalStatements;

import java.util.Scanner;
public class Example04MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Số lớn hơn là: " + a);
        } else if(b > a){
            System.out.println( "Số lớn hơn là: " + b);
        } else {
            System.out.println("Hai số bằng nhau");
        }
    }
}