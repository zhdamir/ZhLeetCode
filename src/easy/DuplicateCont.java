
package easy;

import java.util.HashMap;
import java.util.HashSet;


public class DuplicateCont {

    
    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,4,4};
        int[]arr2={1,2,3,4};
        int[]arr3={1,1,1,3,3,4,3,2,4,2};
        int[]arr4={2,14,18,22,22};
        
        boolean contDup=containsDuplicate(arr);
        System.out.println("The array contains duplicate: "+contDup);
        
    }
    
    public static  boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set= new HashSet<Integer>();
        for(int x :nums){
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;
    
    }
    
    //My method => space and time complexity
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
    
}
