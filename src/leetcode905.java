public class leetcode905 {
    public static void main(String[] args) {
    int[] arr={3,1,2,4};
        System.out.println(paritysort(arr));
    }
    static int[] paritysort(int[] arr){
        int start=0;
        int end=0;

        while(end<arr.length){
            if(arr[end]%2==0){
                swap(arr,start,end);
                start++;
                end++;
            }else{
                end++;
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
