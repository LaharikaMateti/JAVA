import java.util.*;
public class evenOrNot {
     public static boolean isEven(int n){
       if(n%2==0){
        return true;
       }
        return false;
     }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        if(isEven(n))
        {
     System.out.println("number is even");
        }
        else{
           System.out.println("number is odd"); 
        }
        

    }
}

