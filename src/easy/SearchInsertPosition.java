
package easy;


public class SearchInsertPosition {

   
    public static void main(String[] args) {
        
        
        int[]arr={1,3,5,6};
        int indexFound=searchInsert( arr, 5);
        System.out.println("The index found or should be inserted at the index "+indexFound);
        int[]arr2={1,3,5,6,9,13,15,16,18};
        
        int indexFound2=searchInsert( arr2, 6);
        System.out.println("The index found or should be inserted at the index (arr2) "+indexFound2);
        
        
        int[]arr3={1,3,4,6, 9,15,20,22,23,26,29,30,32};
        
        int indexFound3=searchInsert( arr3, 33);
        System.out.println("The index found or should be inserted at the index (arr3) "+indexFound3);
        
        //
        int[]arr4 ={1,3,5,6};
        int indexFound4=searchInsert( arr4, 0);
        System.out.println("The index found or should be inserted at the index (arr4):"+indexFound4);
        
        int[]arr5 ={1,3,5,6};
        int indexFound5=searchInsert( arr5, 2);
        System.out.println("The index found or should be inserted at the index (arr5s):"+indexFound5);
        
        
        int[]arr6 ={1,3};
        int indexFound6=searchInsert( arr6, 4);
        System.out.println("The index found or should be inserted at the index (arr6s):"+indexFound6);
        
        int[]arr7 ={1,3};
        int indexFound7=searchInsert( arr6, 2);
        System.out.println("The index found or should be inserted at the index (arr7s):"+indexFound7);
        
        int[]arr8 ={1,3,5};
        int indexFound8=searchInsert( arr8, 4);
        System.out.println("The index found or should be inserted at the index (arr7s):"+indexFound8);//expected output: 2
    }
    
    public static int searchInsert(int[] nums, int target) {
        boolean found=false;
        int insertIndex=0;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int guess=0;
        while(start<=end){
            mid=(start+end)/2;
            guess=nums[mid];
            if(guess==target){
                return mid;
            }
            //extra line for the case when target is smaller than the very first elemnt in the array
            if((target<guess&&mid==0)||(nums.length==1&&target<nums[0])){
                return 0;
            }
            
            if(nums.length==1&&target>nums[0]){
            
                return 1;
            }
            
             if(nums.length==1&&target<nums[0]){
            
                return 0;
            }
            
             if(target!=guess&&target>nums[0]&&target>nums[1]&&mid==0&&nums.length==2){
                return 2;
            }
             
             if(target!=guess&&target<nums[1]&&target>nums[0]&&mid==0&&nums.length==2){
                return 1;
            }
             
             if((target>guess&&mid==0)){
                return 1;
            }
            
             if(target!=guess&&target>nums[mid-1]&&target<nums[mid]&&target>guess){
                return mid;
            }
             
            if(guess>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return nums.length;
    }
    
    
    
}
