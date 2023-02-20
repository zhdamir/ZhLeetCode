
package easy;


public class NumIdenticalPairs {

    
    public static void main(String[] args) {
       
        int[]nums={1,2,3,1,1,3};
        int[]nums2={1,2,3};
        int[]nums3={1,1,1,1};
        int count=numIdenticalPairs(nums3);
        System.out.println(" nums is "+count);
    }
    
     public static int numIdenticalPairs(int[] nums) {
        
          int count=0;
         for(int i=0; i<nums.length;i++ ){
         
             for(int k=i+1; k<nums.length; k++){
             
                 if(nums[i]==nums[k]){
                     count++;
                 }
             }
         }
         return count;
    }
     
      public static boolean containsDuplicate(int[] nums) {
        boolean dupl=false;
        int count=0;
         for(int i=0; i<nums.length; i++){
             for(int k=i+1; k<nums.length; k++){
                 if(nums[i]==nums[k]){
                     count++;
                 }
             }
         }
         if(count>0){
             dupl=true;
         }
         else{
             dupl=false;
         }
         return dupl;
    }
}
