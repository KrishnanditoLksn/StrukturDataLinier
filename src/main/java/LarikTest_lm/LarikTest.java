package LarikTest_lm;
import SDL_1.Larik;
public class LarikTest {

    public static void main(String[] args) {

            int[] c = new int[12];

            for (int xy = 1; xy < c.length - 1 ; xy++) {
                System.out.printf("%5d%8d\n"  , xy , c[xy]);
            }
            System.out.println("======================================");
            //System.out.printf("%s%8s\n" , "Index" , "Value" );

            int[] cetak ={32 ,27 , 64 , 18 , 95 , 141 ,90 , 70 , 60 , 37 };
            //for(int  f =  0 ; f < cetak.length; f++){
            //    System.out.printf("%5d%8d\n" ,f , cetak[f]);
            Larik.cetak(cetak);
            }
        }
    /*static void BacaArray(int arr) {
        for(int i = 0 ; i < arrayCetak.length; i ++ ){
        }

    }
    */
    /*static int cariIndex(int number) {

    }*/


