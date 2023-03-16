package Sorting;
import SDL_1.Larik;

import java.util.Arrays;

public class MainSorting {
    public static void main(String[] args) {
        int[] a = {5, 8, 26, 15, 11, 31};
        int[] array2 = Arrays.copyOf(a, a.length);
        int [] array3=Arrays.copyOf(a,a.length);

        System.out.println("Bubble Sort Ascending : ");
        System.out.println("=====================================================");
        Larik.BubbleSort(a);
        for (int i : a) {
            System.out.println("\t" + i);
        }

        System.out.println("Selection Sort Ascending :");
        System.out.println("====================================================");
        Larik.SelectionSort(a);
        for (int i : a) {
            System.out.println("\t" + i);
        }


        System.out.println("Bubble sort descending : ");
        System.out.println("========================================================================");


        Larik.DescendingBubble(array2);
        for (int i : array2) {
            System.out.println("\t" + i);
        }

        System.out.println("===========================");
        System.out.println("DESCENDING SELECTION SORT : ");
        Larik.DescendingSelection(a);
        Larik.cetak(a);

        System.out.println("=================================");
        System.out.println("INSERTION SORT : ");
        Larik.InsertionSort(a);
        Larik.cetak(a);

        System.out.println("====================================");
        System.out.println("INSERTION SORT DESCENDING : ");
        Larik.InsertionDescending(a);
        Larik.cetak(a);

        int [] ManyArrays=new int[100];
        for(int i = 0 ; i < ManyArrays.length; i++) {
            ManyArrays[i]= (int) (Math.random() * 100);
        }

        System.out.println("DENGAN BUBBLE SORT");
        System.out.println("=======================================");
        double start = System.nanoTime();
        System.out.println("start : " + start);
        Larik.BubbleSort(ManyArrays);
        double end = System.nanoTime();
        System.out.println("end : " + end);
        double elapse= end - start;
        System.out.println("the elapsed time is " + elapse / Math.pow(10,9));
        System.out.println("======================================");




        System.out.println("DENGAN SELECTION SORT");
        double started = System.nanoTime();
        System.out.println("start : " + start);
        Larik.SelectionSort(ManyArrays);
        double ended = System.nanoTime();
        System.out.println("end : " + ended);
        double elapsed=ended - started;
        System.out.println("the elapsed time is " + elapsed /Math.pow(10,9));
        System.out.println("======================================");



    }
    }

