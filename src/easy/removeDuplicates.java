
package easy;


public class removeDuplicates {

    
    public static void main(String[] args) {
        
        int[]nums = {0,1,2,2,3,3,4,4,4,4,5,6,6,6,6,6,7,8,8,9};
        System.out.println("Original array");
        printArr(nums);
        System.out.println("");
        //String test=removeDuplicates(nums);
        //System.out.println(" "+test);
        /*int[]newArr=removeDuplicates(nums);
        System.out.println("New array");
        printArr(newArr);
        System.out.println("");*/
        
        int k=removeDuplicates(nums);
        System.out.println(" "+k);
        
    }
    
     public static int removeDuplicates(int[] nums) {
        
         String temp="";
         
         int k=0;
         int j=0;
         for(int i=0; i<nums.length;i++){
            if(!temp.contains("*"+String.valueOf(nums[i]+";"))){

                nums[k]=nums[i];
                k++;
                 temp=temp+"*"+String.valueOf(nums[i])+";";
                 j++;
                 
                 
            }else{
                
                nums[i]='_';
            }
          
       }
         return j;
         
    }
     
     public static void printArr(int[]arr){
     
         for(int i=0; i<arr.length; i++){
         
             System.out.print(" "+arr[i]);
         }
     }
    
}
