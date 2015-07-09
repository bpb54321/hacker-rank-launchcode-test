
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
 
    public static void main (String[] args) {
        
      
        //Intitialize number of holes array
        int[] numberOfHoles={1,0,0,0,1,0,1,0,2,1};
        
         //Test case
         //int num=630;
         
         String numString=String.valueOf(num);
         int numStringLength=numString.length();
         String curDigitString;
         int curDigitInt;
         int cumSumOfHoles=0;
         for (int i=0; i<numStringLength; i++) {
             curDigitString=numString.substring(i,i+1);
             curDigitInt=Integer.parseInt(curDigitString);
             cumSumOfHoles+=numberOfHoles[curDigitInt];
            }
             
             
     }
     
}
    
   
