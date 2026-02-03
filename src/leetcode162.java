public class leetcode162 {
    public static void main(String[] args) {

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            //this means we are in decreasing order
            if (arr[mid] > arr[mid + 1]) {
                end = mid;

            } else {  //we are in increasing order
                start = mid + 1;
            }

        }
        return start;
    }
}
