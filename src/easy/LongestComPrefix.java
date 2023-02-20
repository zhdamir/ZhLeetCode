
package easy;

/**
 *
 * @author zopenova
 */
public class LongestComPrefix {

   
    public static void main(String[] args) {
        
        String[] strs = {"flower","flow","flight"};
        String test=longestCommonPrefix(strs);
        System.out.println(" "+test);
        
    }
    
     public static String longestCommonPrefix(String[] strs) {
         
         int length=strs.length;
         String pref="";
         int count =0;
         for(int i=0; i<strs.length; i++){
         
             for(int j=i+1;j<strs.length;j++){
             
                 if(strs[i].charAt(i)==strs[j].charAt(j)){
                 
                     count++;
                 }
                 if(count==strs.length-2){
                     
                         pref=pref+strs[i].charAt(i);
                     }
                 else{
                     
                      pref=pref+"";
                   }
                 
             }
             
         }
        
         return pref;
    }
    
}
