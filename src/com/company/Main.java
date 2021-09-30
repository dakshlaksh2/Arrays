package com.company;

import java.util.Arrays;

//import java.util.Arrays;
public class Main {

    public static void main(String[] args){
        String[] xArray = new String[3];
        xArray[0] = "Jafer";
        xArray[1] = "M";
        xArray[2] = "Alhaboubi";
        //   System.out.println(xArray[0]);

/*        String[] myNameArray = {"Jafer", "M", "Alhaboubi"};
        System.out.println("myNameArray length: " + myNameArray.length);
        Arrays.sort(xArray);
        System.out.println(Arrays.toString(xArray));
*/

    /*  for(int index=0; index < xArray.length ;index++){
          xArray[index] = xArray[index] + " v2.0";
          System.out.println(xArray[index]);
      }*/

/*
        String[][] twoD = {
                // col 0  // col 1
                {"one", "two"}, // row 0
                {"three", "four", "extra"}, // row 1
                {"five", "six"}, // row 2
                {"seven", "eight"} // row 3
        };*/
        //  System.out.println(twoD[3][1]);


      /*  System.out.println("method 1 - easy");
        System.out.println(Arrays.deepToString(twoD));*/

/*
        System.out.println("method 2 - hard");
        for ( int row = 0 ; row < twoD.length ; row++){
            for(int col = 0 ; col < twoD[row].length ; col++){
                System.out.print(" [");
                System.out.print(twoD[row][col]);
                System.out.print("] ");
            } // inner
            System.out.println();
        } // outer
        for(String[] row: twoD){
            for(String col: row){
                System.out.print(" [");
                System.out.print(col);
            }System.out.print("] ");
            System.out.println();
        }*/

        // row // col // depth
        String [][][] threeD = {

                //col 0             // col 1
                {{"one", "two"}, {"three", "four"}}, // row 0
                {{"five", "six"}, {"seven", "eight"}}, // row 1
                {{"nine", "ten"}, {"eleven", "twelve"}} // row 2
        };


        //  System.out.println(threeD[2][0][0]);
   /*     for ( int row = 0 ; row < threeD.length; row++){
            for(int col = 0; col < threeD[row].length; col++){
                for(int depth = 0 ; depth < threeD[row][col].length ; depth++){
                    System.out.println(threeD[row][col][depth]);
                } // depth
            } // col
        } // row
        */

        /*
        for(String[][] row: threeD){
            for(String[] col: row){
                for(String depth: col){
                    System.out.println(depth);
                }
            }
        }*/

        System.out.println(Arrays.deepToString(threeD));


    }
}
