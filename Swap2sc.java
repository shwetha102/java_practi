//write a java program to swap 2 members without variable
import java.util.Scanner;
class Swap2sc{
  public static void main(String[] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    a=sc.nextInt();
    System.out.println("enter b number");
    b=sc.nextInt();
      
    a=a+b;  //30
    b=a-b;
    a=a-b;
    
    System.out.println("swap two number a"+a);
    System.out.println("swap two number b"+b);
  }
}
