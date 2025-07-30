package Practice;

public class MainDept {
    public static void main(String[] args) {
        Dept obj=new Dept();
        obj.setDeptId(25);
        obj.setDeptName("Ajay");
        System.out.println("Id:"+obj.getDeptId()+"\nDeptName:"+obj.getDeptName()+"\nWork Type:"+Dept.deptType);
    }
}
