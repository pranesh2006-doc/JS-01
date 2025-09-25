public class Demo{
    public static void main(String[] args) {
        int arr[]={234,45,56,67,78,56,34};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        reverse(arr,0,arr.length-1);
        System.out.println("after an swaping");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
     
        
    }
     static void reverse( int[] arr ,int start,int end){
       
        while(start <= end){
           int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

           start++;
           end--;

        }
    
    }
}
