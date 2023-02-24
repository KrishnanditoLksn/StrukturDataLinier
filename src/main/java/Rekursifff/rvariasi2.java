package Rekursifff;

public class rvariasi2 {
    public static void main(String[]args){
        count(0);
        System.out.println();
    }
    public static void count(int index) {
        if (index < 2) {
            count(index + 1);
        }
        System.out.println(index);
    }
}
