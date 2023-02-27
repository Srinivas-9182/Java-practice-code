import java.util.Scanner;
class pra_ques6{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array  : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements into array : ");
            arr[i]=sc.nextInt();
        }
            System.out.println("The even numbers in given array are ");
            for(int i=0;i<size;i++){
                if(arr[i]%2==0){
                    System.out.print(arr[i]+",");
                }
        }
        System.out.println();
        System.out.println("The odd numbers in given array are ");
            for(int i=0;i<size;i++){
                if(arr[i]%2!=0){
                    System.out.print(arr[i]+",");
                }
        }
        System.out.println();
        System.out.println("The prime numbers in given array are ");
            for(int i=0;i<size;i++){
                int count=0;
              for(int j=2;j<arr[i];j++){               
                if(arr[i]%j==0){
                    count++;
                }
              }
              if(count==0){
                System.out.print(arr[i]+",");
              }
        }
    }
}