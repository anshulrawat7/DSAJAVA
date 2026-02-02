public class leetcode744 {
    public static void main(String[] args) {
        char[] chh={'c','f','j'};
        char target='a';
        System.out.println(ceiling(chh,target));
    }
    static int ceiling(char[] ch,char target){
        int start=0;
        int end=ch.length-1;



        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<ch[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return ch[start% ch.length];
    }
}
