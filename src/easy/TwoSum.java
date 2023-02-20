
package easy;

/**
 *
 * @author zopenova
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]arr={2,4,11,3};
        int[]arr2=twoSum(arr,6);
        printArr(arr2);
        System.out.println("");
    }
    
    public static int[] twoSum(int[]arr, int target){
    
        int[]arrTwo=new int[2];
        for(int i=0; i<arr.length; i++){
        
            for(int k=0;k<arr.length;k++){
            
                if(i!=k &&arr[i]+arr[k]==target){
                    arrTwo[0]=k;
                    arrTwo[1]=i;
                    break;
                }
                
            }
        }
        return arrTwo;
    }
    
    public static void printArr(int[]arr){
    
        for(int i=0; i<arr.length; i++){
        
            System.out.print(" "+arr[i]);
        }
    }
    
}
