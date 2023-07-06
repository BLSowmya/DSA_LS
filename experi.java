import java.util.Arrays;

import javax.security.auth.x500.X500Principal;

public class experi {
 static  int first=-1;
        static int last=-1;
     static void occur(String str,int ind,char ch){
        
        if(ind==str.length()){
            System.out.print(first+" ");
            System.out.println(last);
            return ;
        }
        if(str.charAt(ind)==ch){
        if(first==-1){
            first=ind;
        }else{
            last=ind;
        }
         }
         occur(str,ind+1,ch);
   
        }
    public static void main(String[] args) {
        String str="dhiiiiiiiraj";
      occur(str,0,'i');
    }
}
