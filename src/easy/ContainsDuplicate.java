
package easy;

import java.util.HashMap;
import java.util.HashSet;


public class ContainsDuplicate {

    
    public static void main(String[] args) {
        
        int[]arr={1,2,3,4,4,4,4};
        int[]arr2={1,2,3,4};
        int[]arr3={1,1,1,3,3,4,3,2,4,2};
        int[]arr4={2,14,18,22,22};
        
        /*boolean duplic=containsDuplicate(arr3);
        System.out.println(" Contains duplicate "+duplic);*/
        System.out.println("contains duplicate with a hash map: ");
        boolean test=contDuplHashMap(arr4);
        System.out.println(" "+test);
        
    }
    
    //works !!! => but how to check in Leetcode?
    public static boolean contDuplHashMap(int[]nums){
        HashMap<Integer, Boolean>numbers= new HashMap<Integer, Boolean>();
        boolean contains=false;
        for(int i=0; i<nums.length; i++){
            if(!numbers.containsKey(nums[i])){
               numbers.put(nums[i], Boolean.TRUE);
            }
            else{
             contains=true;
            }
        }
        return contains;
         
    }
    //https://www.java67.com/2014/12/how-to-break-from-nested-loop-in-java.html#:~:text=There%20are%20two%20steps%20to,outside%20of%20the%20labeled%20loop.
     public static boolean containsDuplicate(int[] nums) {
        boolean dupl=false;
        
        outer: for(int i=0; i<nums.length; i++){
            inner:for(int k=i+1; k<nums.length; k++){
                 if(nums[i]==nums[k]){
                     dupl=true;
                    break inner;
                    
                 }
                 else{
                     dupl=false;
                 }
             }
              
         }
         return dupl;//works, but TIME LIMIT EXCEEDED message=> not optimal
    }
     
     public static boolean containsDuplicate2(int[] nums) {
        boolean dupl=false;
        int count =0;
         for(int i=0; i<nums.length; i++){
             for(int k=i+1; k<nums.length; k++){
                 if(nums[i]==nums[k]){
                     //dupl=true;
                    //break;
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
     
     // solution from the internet
    public boolean ContainsDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<Integer>();
        
        for(int i = 0;i<nums.length;i++)
        {
            if(hSet.contains(nums[i]))
            {
                return true;
            }
            hSet.add(nums[i]);
        }
        return false;
    }
    
    //solution 2
    public boolean ContainsDuplicate3(int[] nums) {
        /*Array.Sort(nums);
        
        for(int i = 0;i<nums.Length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;*/
        return true;
    }
    
}
