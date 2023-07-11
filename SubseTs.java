public class SubseTs {
    public static void main(String[] args) {
        subs("","dhiraj");
    } 
    static void subs(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        //taking first letter and in the next recursion calls;
        char ch=up.charAt(0);
        //adding and changing the length of string
        subs(p+ch,up.substring(1));
        //skipping instead of adding and changing the length of string
        subs(p,up.substring(1));

 int arr[]={1,2,3,4,5};
        for(int starts=0;starts<arr.length;starts++){
            for(int ends=starts;ends<arr.length;ends++){ // this should go till the end so thats why but should not repeat 
                //elements thats why we r starting form index as "starts"index
                for(int i=starts;i<ends;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

/*
        
1 
1 2
1 2 3
1 2 3 4

2
2 3
2 3 4

3
3 4

4
    */



        
        }
}
