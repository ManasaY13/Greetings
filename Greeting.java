import java.util.Scanner;
 class Greeting{
  public static void main(String []args){
   Scanner scan=new Scanner(System.in);
   int ch;
  System.out.println("Pick one 1. Hi     2.Hello       3.Hey");
   ch=scan.nextInt();
   switch (ch){
    case 1: System.out.println(" Hi");
            break;
    case 2: System.out.println("Hello");
             break;
    case 3: System.out.println("Hey");
             break;
    default: System.out.println("Invalid choice");
   }
   }
   }
   
