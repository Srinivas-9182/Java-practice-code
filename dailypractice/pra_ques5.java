import java.util.Scanner;
public class pra_ques5{
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the size of array  : ");
   int size=sc.nextInt();
   int max=0,min=0;
   int arr[]=new int[size];
   for(int i=0;i<size;i++){
    System.out.print("Enter the elements into array : ");
    arr[i]=sc.nextInt();
   }
   min=arr[0];
    for(int i=0;i<size;i++){
        if(arr[i]>max){
            max=arr[i];
        }else if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("The highest number in the given array is"+max);
    System.out.println("The smallest number in the given array is"+min);
}
}