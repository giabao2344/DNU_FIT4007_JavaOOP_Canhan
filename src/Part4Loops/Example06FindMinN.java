package Part4Loops;
import java.util.Scanner;
public class Example06FindMinN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập S: ");
        int S = sc.nextInt();
        int sum = 0, N = 0;
        while (sum + N + 1 <= S) {
            N++;
            sum += N;
        }
        System.out.println("N nhỏ nhất = " + N);
    }
}
