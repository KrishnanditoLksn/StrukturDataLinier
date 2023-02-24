package Rekursifff;

public class upAndDown {
    public static void main(String[]args){
    upAndDown(3);
    }

    public static void upAndDown(int n ) {
        System.out.println("\nLevel:" + n);
        if(n < 4)
            upAndDown(n + 1 );
        System.out.println("\nLEVEL : "+ n);
    }
}
