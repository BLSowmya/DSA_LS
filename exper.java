import java.util.Arrays;

public class exper {
   /*  static void BubblSort(int arr[],int r,int c){
        if(r==0){
            return;
        } 
        if(c<r){
        if(arr[c]>arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
        }
        BubblSort(arr, r, c+1);
    } 
    //we reduce r becaz now we r sorting till 3 rd element of array only ...in every iteartion array size decreses
    else{
        BubblSort(arr, r-1, 0);
    }
    }*/
   static void SelSort(int[] arr){
    for(int i=0;i<arr.length;i++){
        int last=arr.length-i-1;
        int max=getMax(arr,0,last);
        swap(arr,max,last);
    }
   }
   static void swap(int[] arr,int max,int last){
    int temp=arr[last];
    arr[last]=arr[max];
    arr[max]=temp;
   }
   static int getMax(int arr[],int start,int  end){
    int maxs=0;
    for(int i=start;i<=end;i++){
        if(arr[maxs]<arr[i]){
            maxs=i;
        }
    }
    return maxs;
   }
   
   
   
   
    public static void main(String[] args) {
        int arr[]={5,3,32,2};
    /*    BubblSort(arr, 3, 0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/ 
  
        SelSort(arr);
      System.out.print(Arrays.toString(arr));
   
    }
}
