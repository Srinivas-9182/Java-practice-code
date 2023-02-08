import java.util.Scanner;
import java.util.Random;

class R_P_S_Game{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    System.out.println("\t\t\t\t\t"+"=======options to play========");
    System.out.println("\t\t\t\t\t"+"0-Paper   1-Scissor   2-Rock\n");
    System.out.print("Enter your choice :");
    int userinput=sc.nextInt();
    //Generating random number by computer
    int computerchoice=rand.nextInt(3);
    //Validation condition from userinput
    if(userinput>2||userinput<0){
        System.out.println("Enter valid input");
    }else{
    //Playing match between us -(Or)- Checking the inputs of both
    if(userinput==computerchoice){
        System.out.println("\t\t\t"+"** Draw **");
    }else if(userinput==0&&computerchoice==2||userinput==1&& computerchoice==0 ||userinput==2&&      computerchoice==1){
       System.out.println("\t\t\t"+"** You Win **"); 
    }else{
        System.out.println("\t\t\t"+"** Computer Won **");
    }
    
    //(OPTIONAL)-Condition used for printing computer choice
    if(computerchoice==0){
           System.out.println("Computer choosed : Paper");
    }else if(computerchoice==1){
           System.out.println("Computer choosed : Scissor");
    }else{
         System.out.println("Computer choosed : Rock");
    }
    }
 
    }
}