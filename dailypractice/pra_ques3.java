import java.util.Scanner;

// program to find  the sum of digits of the user's given number
public class pra_ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userinput=sc.nextInt();
        int sum=0;
        while(userinput>0){
            int rem=userinput%10;
            sum+=rem;
            userinput=userinput/10;
        }
        System.out.println("The sum of digits is : "+sum);
    }
}
