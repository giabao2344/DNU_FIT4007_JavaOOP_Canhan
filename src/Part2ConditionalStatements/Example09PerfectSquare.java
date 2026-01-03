package Part2ConditionalStatements;


import java.util.Scanner;
public class Example09PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0");
        } else {
            int can = (int) Math.sqrt(N);
            if (can * can == N) {
                System.out.println(N + " là số chính phương");
            } else {
                System.out.println(N + " không phải là số chính phương");
            }
        }
    }
}