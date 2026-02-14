public class leetcode1342 {
    public static void main(String[] args) {
        System.out.println(reduce(14));
    }

    static int reduce(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + reduce(n / 2);
        } else {
            return 1 + reduce(n - 1);
        }
    }
}