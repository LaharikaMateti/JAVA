// Greatest of 3 numbers program
import java.util.*;
public class Greatestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        System.out.println("enter c value:");
        int c=sc.nextInt();
        if(a>=b&&a>=c)
        System.out.println("a is greater");
        else if(b>=c)
        System.out.println("b is greater");
        else
           System.out.println("c is greater");
    }
    
}
