// prime number program
// here we divide the whole loop into two parts.we will check if number is < 2,its not a prime.
//and it also must not have factors blw the range[2,n-1]
// if either of the above two conditions are satisfied ,the number is not a prime
//time complexity:O(N)
//space complexity:O(1)
import java.util.*;
public class prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ,div=2;
      boolean isPrime= true;
        System.out.println("enter number:");
        num= sc.nextInt();
        if(num<2){
          isPrime=false;    
        }
    while(div<num)
    {
        if(num%div==0)
        {
            isPrime=false;
        }
       div++;
        
    }


if(isPrime==true)

    System.out.println("prime");

else 
    System.out.println("not prime");

    }
}


/*    while(div<num/2)
    {
        if(num%div==0)
        {
            isPrime=false;
        }
         div++;
        
    } */
// loop running till n is wasteful
// because for any number n , the numbers in the 
// range (n/2+1,n) wont be divisible anyways