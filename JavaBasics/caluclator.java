// caluclator using switch
import java.util.*;
public class caluclator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        System.out.println("enter operator:");
        char operator=sc.next().charAt(0);
        switch(operator)
        {
          case '+': System.out.println("a+b="+(a+b));
          break;
          case '-': System.out.println("a-b="+(a-b));
          break;
          case '*': System.out.println("a*b="+(a*b));
          break;
          case '/': System.out.println("a/b="+(a/b));
          break;
          case '%': System.out.println("a%b="+(a%b));
          break;
         default: System.out.println("wrong operator");
        }
    }   
}
// sc.next().charAt(0); we get output as string but we want only character
// so we use charAt(0)

