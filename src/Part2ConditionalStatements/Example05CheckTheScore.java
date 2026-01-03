package Part2ConditionalStatements;
import java.util.Scanner;
public class Example05CheckTheScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điểm của bạn: ");
        double diem = sc.nextDouble();

        if (diem >=0 && diem <= 10){
            System.out.println("Điểm " + diem + " là điểm hợp lí");
        } else {
            System.out.println("Điểm " + diem + " là điểm không hợp lí");
        }
    }
}
