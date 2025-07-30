package Practice;

public class Hello {
    int a = 20;
    static int b = 30;

    Hello(){
        a++;
        b++;
        System.out.println("a="+a+"b="+b);
    }

    public static void main(String[] args) {
        Hello obj=new Hello();
        Hello obj1=new Hello();
        Hello obj2=new Hello();
    }
}
