public class leetcode1295 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return  count;
    }
    //check if the number contains are even or not
    static boolean even(int num){
        int numsofdigits=digits(num);
        if(numsofdigits%2==0){
            return  true;
        }
        return  false;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }

        if(num==0){
            return 1;
        }

        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
