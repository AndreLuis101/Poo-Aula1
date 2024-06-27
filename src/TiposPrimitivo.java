public class TiposPrimitivo{
    public static void main(String[] args){
        byte b = 10; //1 byte
        short s = 100; //2 bytes
        int i = 40; //4 bytes
        long l = 100; //8 bytes
        
        float f = 10.0f; //4 bytes
        double d = 20.0; //8 bytes
        
        float g = (float)d; // Trunca o double em float
        
        boolean bb = true;
        char c = 'a';

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(g);
        System.out.println(bb);
        System.out.println(c);
    }
}
