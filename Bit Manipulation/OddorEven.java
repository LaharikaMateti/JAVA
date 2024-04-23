public class OddorEven {
    public static void checknumber(int n){
        int bitmask = 1;
        if((n&bitmask) ==1){
            System.out.println("Odd Number");
        }else{
            System.out.print("Even Number");
        }
    }
    
    public static void main(String[] args) {
        checknumber(3);
        checknumber(11);
        checknumber(14);
    }
}
