// print reverse of a number

/* public class printReverse {
    public static void main(String[] args) {
        int n=-123;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
     System.out.println();
    }
} */
// To save the reverse of a number
import java.util.*;
public class printReverse {
    public static void main(String[] args) {
        int n,rev=0;
        System.out.println("enter n value:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        rev=0;
        while(n!=0){
            int lastdigit=n%10;
           rev=(rev*10)+lastdigit;
            n=n/10;
        }
      if(rev<Math.pow(2,31)||rev>Math.pow(2,31)-1){
            System.out.println("0"); 
         }   
         else{  
     System.out.println(rev);
      }
      
    }
}
 

