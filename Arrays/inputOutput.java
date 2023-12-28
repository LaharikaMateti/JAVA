import java.util.*;
public class inputOutput{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //int phy;
        //phy=sc.nextInt();
       int marks[]=new int[50];// creation of an array
       System.out.println("length of an array is : "+marks.length);
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//math
        System.out.println("phy: "+ marks[0]);
         System.out.println("chem: "+ marks[1]);
          System.out.println("maths: "+ marks[2]);
     // marks[2]=50;
       //  marks[2]=marks[2]+1;
          // System.out.println("maths: "+ marks[2]);
           int percentage=marks[0]+marks[1]+marks[2]/3;
           System.out.println("percentage:"+percentage+"%"); 

    }
}
