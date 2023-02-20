
package hard;


public class MedianSortedArray {

   
    public static void main(String[] args) {
       
        int[]arr1={1,3};
        int[]arr2={2};
        double median=findMedianSortedArrays(arr1,arr2);
        //int[]merged=findMedianSortedArrays(arr1,arr2);
        //printArr(merged);
        System.out.println("The median of the array is "+median);
        System.out.println(" "+Double.valueOf(5)/Double.valueOf(2));
        
    }
    
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
         double median=0;
        int []merged=new int[nums1.length+nums2.length];
        
        int k=0;
        for(int i=0;i<merged.length;i++){
            if(i<nums1.length){
                merged[i]=nums1[i];
            }
            else{
                merged[i]=nums2[k];
                k++;
            }
        }
        
        median=(Double.valueOf(merged[0])+Double.valueOf(merged[merged.length-1]))/2;
        
        
        return median;
    }
     
     public static void printArr(int[]arr){
     
         for(int i=0; i<arr.length; i++){
             System.out.print(" "+arr[i]);
         }
     }
    
}
