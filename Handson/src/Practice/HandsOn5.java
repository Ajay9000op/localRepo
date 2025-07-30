package Practice;

import java.util.Scanner;

public class HandsOn5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int size =sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the  elements in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();


        }
        System.out.println("The elements are:");
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("Enter The arr index");
        int a=sc.nextInt();
        System.out.println(a<size?"The arr element at index "+a+"="+arr[a]:"The arr element successfully accessed");
//
//        System.out.println(");
//        System.out.println(;



    }
}
