/* program to print the pattern
 *         *
 *         **
 *         ***
 *         ****
 *         *****
 *         *****
 *         ****
 *         ***
 *         **
 *         *
 */
import java.util.Scanner;
public class prac_ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print pattern as above");
        int rows=sc.nextInt();
        for (int i = 1; i <=rows; i++) {
          for (int j = 0; j < i; j++) {
              System.out.print("*"+" ");
          }
          System.out.println();
        }
        for (int i = rows; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
          }
      
    }
}
