package Practice;

public class Clothing {
    int id;
    int size;
    double price;
    char color;
    Clothing(){
        this(20,3,500,'G');

    }
    Clothing(int id,int size,double price,char color){
        this.id=id;
        this.size=size;
        this.price=price;
        this.color=color;
    }
    void display(){
        System.out.println("ClothID: "+id +","+"\nCloth size: "+size +","+"\nCloth price: "+price +","+"\nCloth colour: "+color);
    }

    public static void main(String[] args) {
        Clothing obj=new Clothing();
        Clothing obj1=new Clothing(10,2,200,'B');
        obj1.display();
        System.out.println("==============================================================");
        obj.display();

//        System.out.println(obj1.id,obj1.size,obj1.price,obj1.colour);
    }
}
