import java.util.*;
public class palindrome {
     public static boolean isPalindrome(int n){
       
        int rev=0;
        int myNum=n;
             while(n!=0){
            int lastdigit=n%10;
            rev=lastdigit+(rev*10);
            n=n/10;
             }
               if(rev<0){
          return false;
       }
     else if(rev==myNum)
       {
        return true;
       }
     
       return false;
     }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
       
       if(isPalindrome(num))
       {
        System.out.println(num+" is palindrome");
       }
       else{
        System.out.println(num+" is not a palindrome ");
       }

    }

    
}
