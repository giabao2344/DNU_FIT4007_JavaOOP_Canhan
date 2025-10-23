package Part7Methods;

public class Example05CalculateFactorial {
    static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}


