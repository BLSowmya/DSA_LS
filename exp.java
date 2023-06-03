public class exp {
   /*  static int countnum =0;
    public int count(int num){ 
        if(num==0){
            count(num/10);
            countnum++;
        }
        else{
            count(num/10);
        }

        return countnum;
    }*/
public static int sorted(int arr[],int ind){
    if(ind==arr.length-1){
        return 1;
    }
    if(arr[ind]>arr[ind+1]){
        return 0;
    }
    else{
        return sorted(arr,(ind+1));
    }

    
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int res=sorted(arr,0);
        System.out.println(res);
    }
}
