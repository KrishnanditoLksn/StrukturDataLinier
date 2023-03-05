package Searching;

import SDL_1.Larik;

import java.util.Arrays;

public class MainSearch {
    public static void main(String[]args) {
        int[] a = {5, 8, 26, 15, 11, 31};
        Arrays.sort(a);
        int find = 15;

        int Result = Larik.SequentialSearch(a, find);
            if (Result > 0) {
                System.out.println("Result of Sequential Search Algorithm  to find 15 as a target");
                System.out.println(" Data " + find+" found at : " + " index " + Result);
            }
        else {
            System.out.println("Not found ");
        }

        System.out.println("=======================================================================");

        int BinaryResult = Larik.BinarySearch(a , find);
        if(BinaryResult != -1){
            System.out.println("Result of Binary Search Algorithm to find 15 as a target  ");
                System.out.println(" Data  " + find + " found at : "  + " index "+  BinaryResult );
                }
        else {
            System.out.println("Not found");
        }

        System.out.println("=======================================================================");

        int InterpolationResult=Larik.InterpolationSearch(a,find);
        if(InterpolationResult != -1 ){
            System.out.println("Result of Interpolation Search Algorithm to find 15 as a target");
            System.out.println(" Data " + find + " found at : " +" index " + InterpolationResult);
        }
        else{
            System.out.println("Not Found ");
        }
    }
}
