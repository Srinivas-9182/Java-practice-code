
//program to sort all characters in a given string
import java.util.Scanner;
public class prac_ques11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input.toLowerCase();
        char []ch=input.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        for(char ch1:ch){
            System.out.print(ch1);
        }
    }
}
