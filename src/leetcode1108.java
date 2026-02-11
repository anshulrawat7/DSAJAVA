//bruteforce
/*public class leetcode1108 {
    public static void main(String[] args) {
        String str="1.1.1.1";
        String s=defangIPaddr(str);
        System.out.println(s);

    }
    static String defangIPaddr(String address) {
            int n=address.length();
            String str="";
            for(int i=0;i<n;i++){
                char ch=address.charAt(i);

                if(ch!='.'){
                    str=str+ch;
                }else{
                    str=str+"[.]";
                }
            }
            return str;
    }
}*/

//optimal solution
public class leetcode1108 {
    public static void main(String[] args) {
        String str="1.1.1.1";
        String s=defangIPaddr(str);
        System.out.println(s);

    }
    static String defangIPaddr(String address) {
        int n=address.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=address.charAt(i);

            if(ch!='.'){
                sb.append(ch);
            }else{
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}
