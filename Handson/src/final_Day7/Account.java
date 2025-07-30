package final_Day7;

public interface Account {
    public static final long accId= 1234567892L;
    public abstract void closeAcc();

}
interface B{}
class SavingAccount implements Account,B{
    @Override
    public void closeAcc() {
        System.out.println("Inside savinngs acccount:"+accId);
    }

    public static void main(String[] args) {
        Account obj= new SavingAccount();
        obj.closeAcc();
    }
}
