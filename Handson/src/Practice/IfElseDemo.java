package Practice;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String args[]){
        System.out.println("Enter Number: ");
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        if(m == 12 || m==1 || m==2)
            System.out.println("Winter");
        else if(m == 3 || m==4 || m==5 )
            System.out.println("Spring");
            else if(m == 6 || m== 7|| m==8)
            System.out.println("summer");
            else
            System.out.println("Error");
    }
}
