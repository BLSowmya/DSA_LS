import javax.sound.sampled.ReverbType;

public class recursion {
    static int sum=0;
    public static int reverse(int num){
      
        int rem=0;
        if(num==0){
            return num*10;
        }     
        rem=num%10;
        sum=sum*10+rem;
        num=num/10;
        reverse(num);
        

        return sum;
    }
    public static void main(String[] args) {
       
        System.out.println(reverse(1234));
        
    }
    
}
