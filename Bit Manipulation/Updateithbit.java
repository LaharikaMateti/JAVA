public class Updateithbit {
    public static int SetIthBit(int n , int i){
        int Bitmask = 1<<i;
         return n|Bitmask;   
    } 
    public static int ClearIthBit(int n , int i){
        int Bitmask = ~1<<i;
         return n&Bitmask;   
    }
    public static int UpdateIthBit(int n , int i , int newbit){
        if (newbit==0){
         return ClearIthBit(n,i);
        }else{
            return SetIthBit(n,i);
        }
    }

    public static void main(String[] args) {
        System.out.print(UpdateIthBit(10,2,1));
    }
}