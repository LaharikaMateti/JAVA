public class decToBin {
    public static void dectoBin(int num){
        int myNum= num;//save the decimal number
        int binNum=0;
       int pow=0;
       while(num>0){
        int rem= num%2;
        binNum=binNum+(rem*(int)Math.pow(10,pow));
        pow++;
       num=num/2;
 }
 System.out.println("Binary of "+myNum+" is: "+binNum);
    }
    public static void main(String[] args) {
        dectoBin(15);
    }
}
