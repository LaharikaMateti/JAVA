public class ArrayasFunctionArguments {
           public static void update(int marks[],int nonchangeable){
             nonchangeable=10;
            for(int i=0;i<marks.length;i++){
                marks[i]=marks[i]+1;
            }
           }
    public static void main(String[] args) {
        int marks[]= {20,30,40};
        int nonchangeable=5;
        update(marks,nonchangeable);
        System.out.println(nonchangeable);
        //print marks
     for(int i=0;i<marks.length;i++){
               System.out.print(marks[i]+" ");
            }
    }
}
