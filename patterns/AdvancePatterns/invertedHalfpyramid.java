public class invertedHalfpyramid {
     public static void invertedHalf(int n){
         for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
     } 
    public static void main(String[] args) {
        invertedHalf(5);
    }
}
