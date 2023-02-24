package Rekursifff;

public class Matematika {
    static int n ;
    public static void main(String[]args){
        System.out.println(faktorialRekursif(10));
        System.out.println(faktorialIteratif(10));
    }

    public static int faktorialRekursif(int n) {

        if ((n == 1) || (n == 0)) {
            return 1;
        } else {
                return n * faktorialRekursif(n- 1);
        }
    }
    public static int faktorialIteratif(int n ) {
        int factorial = 1;
        if((n ==1 || n ==0)) {
            return 1;
        }
        else {

            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }

        return factorial;
    }

}
