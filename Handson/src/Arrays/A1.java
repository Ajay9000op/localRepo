package Arrays;

import java.util.Scanner;


public class A1 {
    static void show(int ... x){ //variable argument
        for(int i : x){
            System.out.println(i);
        }

    }
    public static void main(String[] args){
        show(20,40,50,60,70);
       // BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Scanner br=new Scanner(System.in);
        System.out.println("Enter name");
        String name=br.nextLine();
        System.out.println("Enter marks");
        int marks=br.nextInt();


        System.out.println("Name:"+name+"\nmarks:"+marks);
    }
}
