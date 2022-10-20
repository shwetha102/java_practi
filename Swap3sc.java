//write a java program to swap 2 members with using third variable
import java.util.Scanner;
class Swap3sc{
  public static void main(String[] args){
    int a, b,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    a=sc.nextInt();
    System.out.println("enter b number");
    b=sc.nextInt();
    
    temp = a;
    a = b;
    b = temp;
    System.out.println("swap two numbers a"+a);
    System.out.println("swap two numbers b"+b);
   
  }
}