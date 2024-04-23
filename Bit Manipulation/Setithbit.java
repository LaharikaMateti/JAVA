public class Setithbit {
    public static int SetIthBit(int n , int i){
        int Bitmask = 1<<i;
         return n|Bitmask;   
    }
    public static void main(String[] args) {
    System.out.print(SetIthBit(10,2));
   
}
}
