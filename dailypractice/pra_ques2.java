// program to swap only the first and last digit of a given number 
import java.util.Scanner;
public class pra_ques2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int org=x;
        int size=0,rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
             x=x/10;
             size++;  
        }
        x=rev;
        rev=0; 
        int dig_count=size;
        while(x!=0){
            int rem=x%10;
            if(dig_count==size||dig_count==1){
                rem=org%10;
                rev=rev*10+rem;
            }
            else{
                rev=rev*10+rem;
            }
            x=x/10;
            org=org/10;
            dig_count--;
        }
        System.out.println("The required swaped number is"+rev);
    }
}
