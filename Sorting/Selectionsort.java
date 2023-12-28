public class Selectionsort {
    public static void selectionsort(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j]){
                   min=j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    } 
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++ ){
            System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2} ;
       selectionsort(arr);
        printArr(arr); 
}
    }