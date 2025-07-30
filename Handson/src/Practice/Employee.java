package Practice;

public class Employee {
    int empID=001;
    String empName="Ajay";

    Employee(){

    }
    Employee(int eId,String eName){
        empID=eId;
        empName=eName;
    }
    public static void main(String[] args) {
        Employee obj=new Employee();
        Employee obj1=new Employee(5,"Ajay");
        System.out.println(obj1.empID);


    }
}
