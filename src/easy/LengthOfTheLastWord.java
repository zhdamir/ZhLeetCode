
package easy;


public class LengthOfTheLastWord {

    
    public static void main(String[] args) {
        String s = "Hello World, My Name Is Zhyldyz and i am following my dreams";
        int lengthWord=s.length();
        System.out.println("lenth of the word "+lengthWord); 
         String[] words=s.split(" ");
         printArr(words);
         System.out.println("");
         int arrLength=words.length;
         System.out.println("The length of the array: "+arrLength);
         System.out.println("  "+words[1]);
         System.out.println("The length of the last word is "+words[1].length());
        System.out.println("Test the method: ");
        int lastLength=lengthOfLastWord(s);
        System.out.println("The length of last word is "+lastLength);
        System.out.println("");
        
        
        
    }
    public static void printArr(String []arr){
    
        for(int i=0; i<arr.length; i++){
        
            System.out.print(" "+arr[i]);
        }
    }
    
    public static int lengthOfLastWord(String s) {
        
        int lengthLastWord=0;
        String[] words=s.split(" ");
         int lengthArray=words.length;
         lengthLastWord=words[lengthArray-1].length();
        return lengthLastWord;
    }

    
}
