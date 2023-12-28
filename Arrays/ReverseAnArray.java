// Time Complexity: O(N)
// space complexity : O(1) 
public class ReverseAnArray {
          public static void reverseofanArray(int numbers[]){
                int first=0,last=numbers.length-1;
                while(first<last){//we not kept first<=last because
    //  if first and last are on same element ,then there is no need to swap
               int temp = numbers[last];
                numbers[last]= numbers[first];
                numbers[first]= temp;
                first++;
                last--;
          }
        }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
         reverseofanArray(numbers);
       // print an array
       for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
       }
      System.out.println();

    }

}
