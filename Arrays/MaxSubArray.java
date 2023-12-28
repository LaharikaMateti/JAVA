public class MaxSubArray{
    public static void MaxSubarraysSum( int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int current_sum=0;
        for(int i=0;i<numbers.length;i++){
            int start =i;
             for(int j=i;j<numbers.length;j++){
            int end =j; 
           current_sum=0;
            for(int k=start;k<=end;k++){// print max sum 
                current_sum=current_sum+numbers[k];
            }
            System.out.println(current_sum);
            if(maxsum<current_sum){
                  maxsum=current_sum;
            }      
        }
     
    }
System.out.println("Max sum = "+maxsum);
}
public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};
     MaxSubarraysSum(numbers);

}
}