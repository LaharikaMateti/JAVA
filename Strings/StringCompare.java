public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Maha";
        String s2 = "Maha";
        String s3 = new String("Maha");
        // '==' checks the strings at object level
        if (s1 == s2)
            System.out.println("equal");
        else
            System.out.println("not equal");

        if (s1 == s3)
            System.out.println("equal");
        else
            System.out.println("not equal");

        // .eauals checks the value inside it
        if (s1.equals(s3))
            System.out.print("equal");
        else
            System.out.print("not equal");

    }
}
