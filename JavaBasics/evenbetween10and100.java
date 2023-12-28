public class evenbetween10and100 {
    public static void main(String[] args) {
        int i = 10;
        System.out.print(i+" ");
        while(i<=98){
            i=i+2;
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
