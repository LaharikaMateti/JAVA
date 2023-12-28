import java.util.*;
public class Avgof25examscores {
    public static void main(String[] args) {
       int sum=0;
       int count=1;
       int score;
        Scanner sc=new Scanner(System.in);
       
       while(count<=25){
        System.out.println("enter a score:");
        score=sc.nextInt();
        sum=sum+score;
        count++;
       }
       int avg=sum/25;
       System.out.println("Avg="+avg);
   
       
    }
}
