package final_Day7.handson9;
import java.util.Random;
import java.util.random.RandomGenerator;

public interface Compartment {
    void notice();
}
class FirstClass implements Compartment{
    @Override
    public void notice() {
        System.out.println("Suitable to the Comfortble");
    }
}
class Ladies implements Compartment{
    @Override
    public void notice() {
        System.out.println("Suitable to the ladies");
    }
}
class General implements Compartment{
    @Override
    public void notice() {
        System.out.println("Suitable to the all people");
    }
}
class Luggage implements Compartment{
    @Override
    public void notice() {
        System.out.println("Suitable to the Luggage");
    }
}
class TestCompartment{
    public static void main(String[] args) {
        Compartment[] arr=new Compartment[10];
        Random rand = new Random();
        for(int i=0;i<10;i++){
            int num =rand.nextInt(4) +1;
//            System.out.println(num);
            switch (num){
                case 1:
                    arr[i]=new FirstClass();
//

                    break;
                case 2:
                    arr[i]=new Ladies();

                    break;
                case 3:
                    arr[i]=new General();

                    break;
                case 4:
                    arr[i]=new Luggage();

                    break;
            }
        }
        for(int i=0;i<10;i++){
            System.out.println("compartment: " +(i+1));
            arr[i].notice();
        }

    }
}