public class Substring {
    public static String substring(String str, int si,int ei){
          String substr = "";
         for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
         }
         return substr;
    }
    
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        System.out.print(str.substring(0,5));
        System.out.print(substring(str,0,5));
        }
}
