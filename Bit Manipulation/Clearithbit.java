public class Clearithbit {
    public static int ClearIthBit(int n , int i){
        int Bitmask = ~1<<i;
         return n&Bitmask;   
    }
    public static void main(String[] args) {
    System.out.print(ClearIthBit(10,1));
   
}
}
