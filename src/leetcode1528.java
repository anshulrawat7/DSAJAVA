public class leetcode1528 {
    public static void main(String[] args) {


    }
    static String solution(String s,int[] indices){
        char[] str=new char[s.length()];

        for(int i=0;i<s.length();i++){
            str[indices[i]]=s.charAt(i);
        }
        return String.valueOf(str);
    }
}
