import java.util.*;
public class prime {
    public static void main(String[] args) {
    int div=2;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value:");
   int n=sc.nextInt();
    
    while(div<n){
        if(n%div==0){
      System.out.print("prime");
      break;
        }
        else{
            div++;
        }
        System.out.print("not prime");
        break;
    }
}
}
   
