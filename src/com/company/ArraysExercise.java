package com.company;

import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        /*Write a program that creates an array of integers with a length of 3.
         Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/
        int[] xArray ={1,2,3};
        System.out.println(Arrays.toString(xArray));
        /*Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2}
         and produce the following output: 7*/
        int[] arraySort={13,5,7,68,2};
        Arrays.sort(arraySort);
        System.out.println(arraySort[2]);
        /*Write a program that creates an array of String type and initializes it with the
        strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy
        using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify
         that the original array was copied.*/
        String[] stringArray={"Red","Green","Blue","yellow"};
        System.out.println(stringArray.length);
        String[] stringClone=stringArray.clone();
        System.out.println(Arrays.toString(stringClone));
        /*Write a program where you create an integer array with a length of 5. Loop through
        the array and assign the value of the loop control variable (e.g., i) to the corresponding
        index in the array.*/
        int[] intArray =new int[5];
        for(int i=0; i<intArray.length; i++){
            intArray[i] = i;
            System.out.print(intArray[i]+" ");
        }
        /*Write a program where you create an integer array of 5 numbers. Loop through
         the array and assign the value of the loop control variable multiplied by 2 to the corresponding
         index in the array.*/
        System.out.println();
        int[] intArray2 =new int[5];
        for(int i=0; i<intArray2.length; i++){
            intArray2[i] = (2*i);
            System.out.print(intArray2[i]+" ");
        }
        /*Write a program that creates a String array of 5 elements and swaps the first element with the
    middle element without creating a new array.*/
        String[] stringArray1={"Red","Blue","Green","yellow","Orange"};
        stringArray1[0] = stringArray1[2];
        stringArray1[2] = stringArray1[0];
        System.out.println(Arrays.toString(stringArray1));
        /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        Print the array in ascending order, print the smallest and the largest element of the array.
        The output will look like the following:*/
        int[] intArray3 ={4, 2, 9, 13, 1, 0};
        Arrays.sort(intArray3);
        System.out.println("Ascending order array: "+Arrays.toString(intArray3));
        System.out.println("The smallest number in the array is "+ intArray3[0]);
        System.out.println("The Largest number in the array is "+ intArray3[5]);

    }
}
