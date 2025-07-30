package Arrays;

public class AA {
    int x;
    int y;
    AA(){

    }
    public AA(int a, int b) {
        this.x = a;
        this.y = b;
        System.out.println("x="+x+"y="+y);
    }
}
class BB extends AA{
    int z;
    BB(){

    }

    public BB(int a,int b,int c) {
        super(a,b);
        this.z = c;
        System.out.println("x="+x+"y="+y+"z="+z);
    }
}
class MainDemo{
    public static void main(String[] args) {
        BB obj = new BB(200,300,400);
    }
}
