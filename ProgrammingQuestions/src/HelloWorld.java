 import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       int[] nums1  = new int[]{};
       int[] nums2  = new int[]{3};
       double c  = findMedianSortedArrays(nums1,nums2);
       System.out.println(c);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m = nums2.length;
        int ne = n+m;
        double median  = 0;
        int[] arr  = new int[ne];
        for(int i = 0;i<=arr.length-1;i++){
            if(i<=nums1.length-1){
            arr[i] = nums1[i];
            }
            else{
                arr[i]=nums2[i-nums1.length];
            }
        }
        Arrays.sort(arr);
        for(int i = 0;i<=arr.length-1;i++){
        System.out.println(arr[0]);
        }
        System.out.println(arr.length);
        for(int i = 0;i<arr.length-1;i++){
            if(arr.length == 1){
                median  = arr[0];
            }
             else if(arr.length %2 ==0){
                median  = arr[arr.length/2]+arr[(arr.length/2)-1];
                median = median/2;
            }
            else{
                median  =  arr[arr.length/2];
            }
        }
      return median;  
    }
}