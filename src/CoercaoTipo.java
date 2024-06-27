public class CoercaoTipo {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        
        boolean z = b == d;

        System.out.println(b);
        System.out.println(d);
        System.out.println(z);
    }
}
