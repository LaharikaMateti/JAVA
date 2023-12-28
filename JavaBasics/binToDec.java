public class binToDec {
    public static void bintoDec(int binNum){
       int myNum=binNum;//saving binary  number
       int decNum=0;
       int  pow=0;
        while(binNum>0){
            int Lastdigit=binNum%10; //take last digit
            decNum=decNum+(Lastdigit *(int) Math.pow(2,pow));
            pow++;
            binNum=binNum/10;//remove last digit of binaty number
  }
System.out.println("decimal of "+myNum+" is: "+decNum);
    }
public static void main(String[] args) {
    bintoDec(111);
}

}