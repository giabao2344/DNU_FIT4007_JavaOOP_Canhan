package part1basicvariables;
import java.util.Scanner;
public class Example03PerimeterAcreageRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều rộng hình chứ nhật: ");
        double b = sc.nextDouble();
        double chuvi = (a+b)/2;
        double dientich = a*b;
        System.out.println("Chu vi hình chữ nhật là: " + chuvi);
        System.out.println("Diện tích hình chữ nhật là: " + dientich);
    }
}

