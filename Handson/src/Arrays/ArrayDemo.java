package Arrays;

public class ArrayDemo {
    private int size;
    private int id;
    private String color;
    private int fit;

    public int getSize() {
        return size;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getFit() {
        return fit;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFit(int fit) {
        this.fit = fit;
    }
    ArrayDemo(){

    }

    public ArrayDemo(int size, int id, String color, int fit) {
        this.size = size;
        this.id = id;
        this.color = color;
        this.fit = fit;
    }

    @Override
    public String toString() {
        return "Practice.Arrays.ArrayDemo{" +
                "size=" + size +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", fit=" + fit +
                '}';
    }
    void display(){
        ArrayDemo sh[]=new ArrayDemo[4];
        sh[0]=new ArrayDemo(40,50,"Green",20);
        sh[1]=new ArrayDemo(40,50,"Green",20);
        sh[2]=new ArrayDemo(40,50,"Green",20);
        sh[3]=new ArrayDemo(40,50,"Green",20);
        System.out.println(sh[2]);

    }

    public static void main(String[] args) {
        String s1[] = new String[4];
        ArrayDemo obj=new ArrayDemo();
        s1[0]="Ajay";
        s1[1]="vijay";
        s1[2]="Raghava";
        s1[3]="Rajini";
        System.out.println(s1[3]+","+s1[2]);
        obj.display();
        int arr[][]= new int[2][2];
        arr[0][1]=900;
        arr[0][0]=900;
        System.out.println(arr[0][0]);




    }
}
