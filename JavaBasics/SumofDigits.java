import java.util.*;
public class SumofDigits {
      public static int isSum(int n){
         int sum=0;
        while(n>0){
           int lastdigit=n%10;
           sum=sum+lastdigit;
           n=n/10;
        }
    return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();     
            System.out.println("The sum is: "+isSum(n));
        }
    
}
