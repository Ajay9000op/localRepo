package Polymorphism.Day6;

class Fruit{
    String name;
    String taste;
    int size;
     public Fruit(String name, String taste, int size) {
         this.name = name;
         this.taste = taste;
         this.size = size;
     }
     void eat(){
         System.out.println("Name:"+name+" taste:"+taste+" size:"+size);

     }
 }
 class Apple extends Fruit{
    Apple(String name,String taste,int size){
        super(name, taste, size);
    }
    @Override
     void eat(){
         super.eat();
     }
 }
class Orange extends Fruit{
    Orange(String name,String taste,int size){
        super(name, taste, size);
    }

    @Override
    void eat() {
        super.eat();
    }
}
class Main1{
    public static void main(String[] args) {
        Fruit apple=new Apple("apple","sweet",20);
        Fruit orange=new Orange("orange","Sour",30);
        apple.eat();
        orange.eat();
    }
}