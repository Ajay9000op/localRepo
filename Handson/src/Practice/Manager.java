package Practice;

class Manger extends Employee{
    String design = "admin";

    void display(){
        int empID=2;
        System.out.println(super.empID+"/"+design);//super keyword is used to call base data members


    }

    public static void main(String[] args) {
        Manger obj= new Manger();
        obj.display();
    }
}