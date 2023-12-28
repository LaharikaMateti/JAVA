import java.util.*;
public class avgof3 {
    public static double avg(double a,double b,double c){
   return (a+b+c)/3;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value:");
       double a=sc.nextDouble();
         System.out.println("enter b value:");
        double  b=sc.nextDouble();
          System.out.println("enter c value:");
         double  c=sc.nextDouble();
         System.out.println("avg is:"+avg(a,b,c));
       
    }
}