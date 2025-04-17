
import java.util.*;

public class cal{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
       
        boolean flag = true;
        while(flag){
            System.out.println("1.ADDITION\n2.SUBTRACTION\n3.DIVISION\n4.MULTIPLICATION\n5.EXIT");
            System.out.print("SELECT AN OPTION: ");
            int x = sc.nextInt();
            switch (x) {
                case 1: add();
                break;
                
                case 2: subtract();
                break;

                case 3: divide();
                break;
                
                case 4:multiply();
                break;

                case 5: flag = false;
                break; 
                default: System.out.print("ENTER A VALID OPTION! ");
                break;
            }
        }
    }

    public static void add(){
        System.out.print("ENTER FIRST NUMBER: ");
        int num1 = sc.nextInt(); 
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }

    public static void subtract(){
        System.out.print("ENTER FIRST NUMBER: ");
        int num1 = sc.nextInt(); 
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = sc.nextInt();
        System.out.println(num1-num2);
    }

    public static void divide(){
        System.out.print("ENTER THE DIVIDEND: ");
        int num1 = sc.nextInt(); 
        System.out.print("ENTER THE DIVISOR: ");
        int num2 = sc.nextInt();
        if( num2 == 0 ){
            System.out.println("CAN'T DIVIDE BY ZERO!");
            return;
        }

        System.out.println(num1/num2);
    }

    public static void multiply(){
        System.out.print("ENTER FIRST NUMBER: ");
        int num1 = sc.nextInt(); 
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = sc.nextInt();
        System.out.println(num1*num2);
    }
}