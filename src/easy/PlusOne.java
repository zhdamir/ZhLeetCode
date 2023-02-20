package easy;

public class PlusOne {

    public static void main(String[] args) {

        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};
        int[] digits4 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};

        int[] digits5 = {9, 9, 9, 9, 9, 9, 9, 9, 4, 3, 9, 9};

        int[] digits6 = {9, 2, 9, 9, 4, 9, 8, 9, 9, 9, 9, 9};

        System.out.println("Original array: ");
        printArr(digits1);
        System.out.println("Original array digits5:");
        printArr(digits3);
        System.out.println("");
        printArr(plusOne(digits3));
        System.out.println("");
        System.out.println(" Test modulo operators");

        int num = 124566778;
        int num2 = 123;
        System.out.println("THe modulo of number is " + num2 % 10);
        System.out.println("");
        int num3 = 10;
        int num4 = 100;
        System.out.println(" The modulo of 0 mod 10: " + 0 % num4);
        System.out.println("");

        //Constraints
    }

    public static int[] plusOne(int[] digits) {
        int remZero = 0;
        int remOne = 0;
        int newNum = 0;
        int[] newArr = new int[digits.length + 1];
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else {
            int count = 0;
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] == 9) {
                    count++;
                }
            }
            if (count == digits.length) {

                for (int k = newArr.length - 1; k > 0; k--) {
                    newArr[k] = 0;
                }
                newArr[0] = 1;
                return newArr;
            } else {
                int i = digits.length - 1;
                while (digits[i] == 9) {
                    digits[i] = digits[i] + remOne;
                    newNum = digits[i] + 1;
                    remZero = 0 % newNum;
                    digits[i] = remZero;
                    remOne = digits[i] / newNum;
                    i--;
                }
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

    }

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i]);
        }
    }

}
