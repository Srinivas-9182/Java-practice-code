
// program to find the biggest digit in user's given number;
import java.util.Scanner;
public class pra_ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userinput=sc.nextInt();
        int big=0;
        while(userinput>0){
            int rem=userinput%10;
            if(big<rem){
                big=rem;
            }   
            userinput=userinput/10;
        }
        System.out.println(big);
    }
}
