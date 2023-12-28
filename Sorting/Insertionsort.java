public class Insertionsort {
    public static void  insertionsort(int arr[]){   
          for(int i=1;i<=arr.length;i++){
           int temp=arr[i];
           int j=i-1;
           while(i>=0 && arr[j]>temp){
           arr[j+1]=arr[j];
           j--;
           }
           arr[j+1]=temp;

          }  
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++ ){
            System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2} ;
       insertionsort(arr);
        printArr(arr); 
}
}
