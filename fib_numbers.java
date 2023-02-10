class fib_numbers{
    public static void main(String args[]){
        int a=0,b=1,c;
        System.out.println("20 fibnochi series number are -");
        System.out.print(a+","+b);
        //Already we print 2 number(a&b), so we started i-value from 2
        for(int i=2;i<=20;i++){
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
    }
}