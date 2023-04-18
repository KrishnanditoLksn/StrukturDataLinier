package Sorting;
import SDL_1.Larik;
import java.util.Arrays;

public class MainSorting {
    public static void main(String[] args) {
        int[] a = {100,5,400,1999};
        int []  c = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};
        int[] array2 = Arrays.copyOf(a, a.length);

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

        System.out.println("=====================================");
        System.out.println("QUICK SORT ASCENDING : ");
        Larik.quicksort(c);
        Larik.cetak(c);
        System.out.println("=======================================");


        System.out.println("======================================");
        System.out.println("QUICK SORT DESCENDING : ");
        Larik.quickSortDescending(c);
        Larik.cetak(c);
        System.out.println("=======================================");

        int [] ManyArrays=new int[10000];
        for(int i = 0 ; i < ManyArrays.length; i++) {
            ManyArrays[i]= (int) (Math.random() * 100);
        }


        /*System.out.println("======================================");
        System.out.println("DENGAN INSERTION SORT");
        double starting=System.nanoTime();
        System.out.println("start : " +String.format("%.0f" , starting));
        Larik.InsertionSort(ManyArrays);
        double ending = System.nanoTime();
        System.out.println("End " + ending);
        double elapsing = ending - started;
        System.out.printf("The elapsed time is %.9f seconds " , elapsing /Math.pow(10,9));
        System.out.println("=========================================");*/

        System.out.println("DENGAN BUBBLE SORT");
        System.out.println("=======================================");
        double start = System.nanoTime();
        System.out.println("start : " + String.format("%.0f" ,start));
        Larik.BubbleSort(ManyArrays);
        double end = System.nanoTime();
        System.out.println("end : " +String.format("%.0f" , end));
        double elapse= end - start;
        System.out.printf("The elapsed time is %.9f seconds" , elapse / Math.pow(10,9));

        System.out.println("======================================");
        System.out.println("DENGAN SELECTION SORT");
        double started = System.nanoTime();
        System.out.println("start : " +String.format("%.0f" , started));
        Larik.SelectionSort(ManyArrays);
        double ended = System.nanoTime();
        System.out.println("end : " + String.format("%.0f" ,ended));
        double elapsed=ended - started;
        System.out.printf("The elapsed time is %.9f seconds " , elapsed /Math.pow(10,9));

        System.out.println("======================================");
        System.out.println("DENGAN INSERTION SORT");
        double starting=System.nanoTime();
        System.out.println("start : " +String.format("%.0f" , starting));
        Larik.InsertionSort(ManyArrays);
        double ending = System.nanoTime();
        System.out.println("End " + String.format("%.0f" ,ending));
        double elapsing = ending - started;
        System.out.printf("The elapsed time is %.9f seconds " , elapsing /Math.pow(10,9));
        System.out.println("=========================================");

        System.out.println("=========================================");
        System.out.println("Dengan QUICK SORT");
        double starts = System.nanoTime();
        System.out.println("Start : " + String.format("%.0f" , starts));
        Larik.quicksort(ManyArrays);
        double ends=System.nanoTime();
        System.out.println("End : " + String.format("%.0f" , ends));
        double elaps = ends - starts;
        System.out.printf("The elapsed time is %.9f seconds" , elaps/Math.pow(10,9));
        System.out.println("=========================================");
    }
    }