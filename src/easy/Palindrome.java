
package easy;

import java.util.Arrays;


public class Palindrome {

    public static void main(String[] args) {
        
        int num=1000021;
        String nums= Integer.toString(num);
        System.out.println(" "+nums);
        System.out.println("The length is "+nums.length());
        System.out.println("");
        boolean arr=isPalindrome(num);
       
        System.out.println("");
        System.out.println(" is palindrome "+arr);
        System.out.println("");
        System.out.println("");
        //char[]newArr= isPalindrome2(num);
         //printArr(newArr);
         boolean testP= isPalindrome2(num);
         System.out.println("Palindrome is "+testP);
        
        
        
    }
    
    //121 //212 //313 
    public static boolean isPalindrome(int x) {
        boolean palind=true;
        String xString=Integer.toString(x);
        int lengthX=xString.length();
       char[]arr=new char[lengthX];
       char[] revArr=new char[lengthX];
       
       for(int i=0; i<arr.length;i++){
           arr[i]=xString.charAt(i);
       }
       
       int m=0;
        for(int k= revArr.length-1; k>=0;k--){
           revArr[m]=xString.charAt(k);
           m++;
       }
        palind=Arrays.equals(arr,revArr);
       return palind;
    }
    
    public static boolean isPalindrome2(int x) {
        boolean palind=true;
        String xString=Integer.toString(x);
        int lengthX=xString.length();
       char[]arr=new char[lengthX];
       char[] revArr=new char[lengthX];
       
       for(int i=0; i<arr.length;i++){
           arr[i]=xString.charAt(i);
       }
       
       int m=0;
        for(int k= revArr.length-1; k>=0;k--){
           revArr[m]=xString.charAt(k);
           m++;
       }
        int test=0;
        for(int i=0; i<revArr.length; i++){
            if(arr[i]==revArr[i]){
                test++;
            }
        }
        
        if(test==revArr.length){
        
            palind=true;
        }
        else{
        
            palind=false;
        }
        
       return palind;
    }
    
    public static void printArr(char[]arr){
    
        for(int i=0; i<arr.length; i++){
        
            System.out.print(" "+arr[i]);
        }
    }
    
}
