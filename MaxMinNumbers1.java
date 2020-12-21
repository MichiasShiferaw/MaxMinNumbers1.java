/Scan all primitive data types
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MaxMinNumbers1 {
 
  public static void main(String[] arg) {
    
    // Creates an array with 10 indexes
    int[] rangeArray = new int[10];
    Random rangeVal = new Random();
    //int minValue;
    //int maxValue = 99;
    
    // Adds a random number from 1-99 into the array for every index
    for (int index = 0; index < rangeArray.length; index++) {
      rangeArray[index] = rangeVal.nextInt(40) + 60;
    }

    // Sort the array
    Arrays.sort(rangeArray);
