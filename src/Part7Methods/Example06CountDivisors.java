package Part7Methods;

public class Example06CountDivisors {
    static int countDivisor(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) c++;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(countDivisor(12));
    }
}

