public class Operacoes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        float g = a % b;
        double h = Math.pow(a, b);

        System.out.printf("a + b = %d\n", c);
        System.out.printf("a - b = %d\n", d);
        System.out.printf("a * b = %d\n", e);
        System.out.printf("a / b = %d\n", f);
        System.out.printf("a %% b = %f\n", g);
        System.out.printf("a ^ b = %.0f\n", h);

    }
}
