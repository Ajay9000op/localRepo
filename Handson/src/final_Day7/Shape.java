package final_Day7;

public abstract class Shape {
    void display(){
        System.out.println("Inside Shape");

    }
    abstract void area();

}
class Circle extends Shape{
    @Override
    void area() {
        System.out.println("Inside Circle");
    }

    public static void main(String[] args) {
        Shape obj1 = new Circle();
        obj1.area();
        obj1.display();
    }
}
