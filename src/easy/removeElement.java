
package easy;


public class removeElement {

   
    public static void main(String[] args) {
       int[]nums = {0,2,2,1,2,2,3,3,4,4,4,4,5,2,2,6,6,6,6,6,7,8,8,9};
        System.out.println("Original Array");
        printArr(nums);
        System.out.println("");
        System.out.println("The orig length "+nums.length);
        
        int k=removeElement(nums,2);
        System.out.println(" "+k);
        
        /*int[]arrNew=removeElement(nums,2);
        System.out.println("after remove");
        printArr(arrNew);
        System.out.println("");
        System.out.println("The length of the arr "+arrNew.length);*/
        
        /*int[]newArr=removeElement(nums,2);
        System.out.println("after remove");
        printArr(newArr);
        System.out.println("");
        System.out.println("The length of the arr "+newArr.length);*/
        
        
    }
    
     public static int removeElement(int[] nums, int val) {
        
         int k=0;
         for(int i=0; i<nums.length; i++){
             if(String.valueOf(nums[i]).equals(String.valueOf(val))){
                 nums[i]='_';
             }
             else{
                nums[k]=nums[i];
                k++;
             }
                 
         }
         
        return k;
    }
    
   /* public static int[] removeElement(int[] nums, int val) {
        
        String temp=" ";
        int k=0;
        for(int i=0;i<nums.length; i++){
        
            if(!temp.contains("*"+nums[i]+";") && (nums[i]!=val)){
            
                nums[k]=nums[i];
                k++;
                temp=temp+"*"+nums[i]+";";
            }
            else{
                nums[i]='_';
            }
        }
        return nums;
    }*/
    
    public static void printArr(int[]arr){
     
         for(int i=0; i<arr.length; i++){
             System.out.print(" "+arr[i]);
         }
     }
    
}
