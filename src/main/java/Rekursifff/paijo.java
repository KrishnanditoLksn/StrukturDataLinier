package Rekursifff;

public class paijo {
    public static void main(String[]args){
        int a = paijoo(3);
        System.out.println(a);
    }
    public static int paijoo(int x ){
        if(x == 0 )
            return 0;

        return  2 * paijoo(x - 1 )  + x * x ;
    }

}
