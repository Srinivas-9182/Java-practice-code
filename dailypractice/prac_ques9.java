//program to find the number of words in the user's given string
import java.util.Scanner;

class prac_ques9{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split("\s");
        for (String str : words) {
            System.out.println(str);
        }
    }
}