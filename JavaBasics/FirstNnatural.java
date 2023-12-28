//sum of first n natural numbers program
//in the main fn we initialize the variables
// we run the loop for n+1 times
//keep adding the iterator values to the sum 
//print sum variable
import java.util.*;
public class FirstNnatural{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,sum=0,start=1;
        System.out.println("enter n value:");
        n=sc.nextInt();
        while(start<=n)
        {
            sum=sum+start;
            start++;
        }
        System.out.println(sum);
    }
} 
// sum=n(n+1)/2 - formula 
//time complexity:O(N)
//space complexity:O(1)