package Practice;

public class DataType {
    public static void main(String[] args) {
        byte a=20;
        byte b=30;
        byte c=(byte)(a+b);
        float f1=7.0f;
        float f2=8.0f;
        float f3=(f1+f2);
        System.out.println(f3);
        short s1=800;
        short s2=800;
        short s3=(short)(s1+s2);
        System.out.println(s3);
        int x=20;
        int y=30;
        long z=x+y;//implicit casting
        System.out.println(z);

    }
}
