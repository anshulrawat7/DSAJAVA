
//code is perfect for the question but it is throwing TLE at leetcode
public class leetcode1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
    static int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }

        return (tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
    }
}

