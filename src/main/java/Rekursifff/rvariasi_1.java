package Rekursifff;

public class rvariasi_1 {
    public static void main(String[]args){
        count(3);
        System.out.println();
    }

    public static void count(int index){

        System.out.println(index);
        if(index  < 2 )
            count(index + 1);
    }
}
