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
        }
}
