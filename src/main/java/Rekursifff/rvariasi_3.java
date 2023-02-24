package Rekursifff;

public class rvariasi_3 {
    public static void main(String[]args){
        count(3);
        System.out.println();
    }
    public static void count(int index){
        if (index > 2 )
            count(index - 1 );
        System.out.println(index);
    }
}
