
//program to check whether the user's given string is palindrome or not;
import java.util.Scanner;
public class prac_ques10 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        if(input.equals(rev)){
            System.out.println("Given is palindrome");
        }else{
            System.out.println("Given is Not a palindrome");
        }
     } 
}
