public class LargestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        } 
        System.out.print(largest);
        // TimeComplexity = O(x*n)
        // where x = length and n = no of strings
    }
}
