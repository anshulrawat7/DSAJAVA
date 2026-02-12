public class leetcode509 {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
        //basic and more opitmal
       /* static int fib(int n) {
            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }
            int a=0,b=1,c=1;
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            return c;

        }
    }*/



//using recursion

    static int fib(int n) {
        if(n<2){
            return  n;
        }
        return fib(n-1)+fib(n-2);

    }
}

