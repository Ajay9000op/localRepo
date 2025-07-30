package Practice;

public class Clothing1 {
    private int iD;
    private int price;
    private String size;
    private String color;

    Clothing1(){

    }
    public Clothing1(int iD, int price, String size, String color) {
        this.iD = iD;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public int getiD() {
        return iD;
    }

    public int getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
class Shirt extends Clothing1{
    private int fit;

    Shirt(){

    }
    public Shirt(int fit,int iD,int price,String size,String color) {
        super(iD,price,size,color);
        this.fit = fit;
    }

    public int getFit() {
        return fit;
    }

    public void setFit(int fit) {
        this.fit = fit;
    }
    void display(){
        System.out.println("fit:"+getFit()+" Id:"+getiD()+" price:"+getPrice()+" size:"+getSize()+" color:"+getColor());
    }

}
class Trouser extends Clothing1{
    private String gender;
    private int fit;

    Trouser(){

    }

    public Trouser(int fit,String gender,int iD,int price,String size,String color) {
        super(iD,price,size,color);
        this.fit=fit;
        this.gender = gender;
    }

    public int getFit() {
        return fit;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    void display1(){
        System.out.println("fit:"+getFit()+"ID:"+getiD()+" price:"+getPrice()+" size:"+getSize()+" color:"+getColor());
    }
}
class Main{
    public static void main(String[] args) {

        Shirt obj1=new Shirt(40,30,400,"xl","Black");
        Shirt obj2=new Shirt(50,40,500,"xl","Blue");
        Shirt obj3=new Shirt(60,50,600,"xl","White");
        obj1.display();
        obj2.display();
        obj3.display();
        Trouser obj4=new Trouser(30,"male",30,600,"xxl","Black");
        Trouser obj5=new Trouser(40,"female",40,600,"xl","Red");
        Trouser obj6=new Trouser(50,"male",50,600,"l","Blue");
        System.out.println(obj4.getGender());
        System.out.println(obj5.getGender());
        System.out.println(obj6.getGender());
        obj4.display1();
        obj5.display1();
        obj6.display1();


    }
}
