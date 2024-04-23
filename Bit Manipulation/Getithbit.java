public class Getithbit{
    public static int GetIthBit(int n , int i){
        int Bitmask = 1<<i;
        if((n&Bitmask)==0){
            return 0;
        }else {
            return 1;
        }
    }

public static void main(String[] args) {
    System.out.print(GetIthBit(10,2));
   
}
}