import java.util.Random;
import java.util.Scanner;
class game{
    int number;
    int user_choice;
    public game(){
        Random rand=new Random();
        number=rand.nextInt(100);
    }
    void takeuserinput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Guessed Number :  ");
        user_choice=sc.nextInt();
    }
    boolean Iscorrect(){
        if(user_choice==number){
            System.out.println("\t\t\t\t\t"+"You Guessed the Correct Number");
            return true;
        }else if(user_choice<number){
             System.out.println("\t\t\t\t\t"+"You Guessed the Number Below it");
        }else{
            System.out.println("\t\t\t\t\t"+"You Guessed the Number high to it");
        }
        return false;
    }
}
class GuessTheNumber{
    public static void main(String args[]){
        game user=new game();
        int no_of_guesses=0;
        boolean x=false;
        while(x!=true){
            user.takeuserinput();
            x=user.Iscorrect();
            no_of_guesses++;
        }
        System.out.print("You have taken  "+no_of_guesses+" Guess to find the number");
    }
}