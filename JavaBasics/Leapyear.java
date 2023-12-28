// leap year program 
// Conditions for Leap Year
// For any year to be a leap year the following two conditions must be checked.
// If the year satisfies either of the conditions, it's considered a leap year. 
// Following are the conditions
// 1. The year must be divisible by 400.
// 2. The year must be divisible by 4 but not 100.
import java.util.*;
public class Leapyear {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
        int year = sc.nextInt();
        boolean x=(year%4==0);
        boolean y=(year%100!=0);
        boolean z=(year%400==0);
        if(x&&y||z) 
       System.out.println(year+" is a leap year");
       else
       System.out.println(year+" is not a leap year");
}
}
