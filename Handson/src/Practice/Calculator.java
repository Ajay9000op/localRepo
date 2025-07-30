package Practice;

public class Calculator {
    int sum(int x,int y){
        return x+y;
    }
    float sum(int a,float b){
        return a+b;
    }
    double sum(double d,double e){
        return d+e;
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println(obj.sum(9,9));
        System.out.println(obj.sum(3.0,3.0));
        System.out.println(obj.sum(3,3.0f));


    }
}
