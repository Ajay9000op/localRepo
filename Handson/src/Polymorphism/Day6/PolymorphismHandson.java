package Polymorphism.Day6;

class PolymorphismHandsOn {
    void printArray(int ...arrI) {
        for(int z : arrI) {
            System.out.print(z + " ");
        }
        System.out.println();
    }
    void printArray(double ...arrD) {
        for(double z : arrD) {
            System.out.print(z + " ");
        }
        System.out.println();
    }void printArray(char ...arrC) {
        for(char z : arrC) {
            System.out.print(z + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PolymorphismHandsOn poly = new PolymorphismHandsOn();
        poly.printArray(1,2,3,4,5);
        poly.printArray(33.0,34.0,35.0);
        poly.printArray('a','b','b','z');
    }
}

