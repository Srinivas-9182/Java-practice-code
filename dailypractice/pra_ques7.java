import java.util.Scanner;
class pra_ques7{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[10];
        int x=0;
        while(num>0){
            int rem=num%10;
            int count=0;
            int org=num;
            while(org>0){
                int in_rem=org%10;
                if(in_rem==rem){
                    count++;
                }
                org=org/10;
            }
           
            num=num/10;
            if(count>1){  
                int count2=0;
                for(int i=0;i<10;i++){
                    if(rem==arr[i]){
                    count2++;
                }
            }   
            if(count2==0){
                System.out.println(rem+" repeated "+count);
            }  
            }
            arr[x]=rem;
            x++;
        }
    }
}