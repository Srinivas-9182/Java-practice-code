import java.util.Scanner;

//program to find the number of occurrences of each character in the given string;
public class prac_ques12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input=sc.nextLine();
        int count;
        boolean rep=true;
        input.toLowerCase();
        char[] ch=input.toCharArray();
        for(int i=0;i<ch.length;i++){
            count=1;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i]==ch[j]) {
                    count++;
                }
            }
            if(count>1){
                rep=false;
                Boolean dup=true;
                for(int k=0;k<i;k++){
                    if(ch[i]==ch[k]){
                        dup=false;
                    }
                }
                if(dup&&(ch[i]!=' ')){
                    System.out.println(ch[i]+" ---> "+count);
                }
            
            } 
        }
        if(rep){
            System.out.println("No repeated charcters in the given string");
        }
       
    }
}
