public class leetcode704 {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,6,7,9,10,11,20,30,40};
        int target=40;
        int ans=Binarysearch(nums,target);
        System.out.println(ans);

    }
    static int Binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return  mid;
            }
        }
        return -1;
    }
}
