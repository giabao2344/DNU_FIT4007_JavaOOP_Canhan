package part1basicvariables;
import java.util.Scanner;
public class Example04PerimeterAcreageTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ nhất của tam giác: ");
        double a = sc.nextDouble();
        System.out.println("Nhập cạnh thứ hai của tam giác: ");
        double b = sc.nextDouble();
        System.out.println("Nhập cạnh thứ ba của tam giác: ");
        double c = sc.nextDouble();
        double Cvi = a + b + c;
        double d = (a + b +c)/2;
        double S = Math.sqrt(Cvi*(d - a)*(d - b)*(d - c));
        System.out.println("Chu vi tam giác là: " + Cvi);
        System.out.println("Diện tích tam giác là:" + S);
    }
}