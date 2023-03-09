package SDL_1;
public class Larik {

    public static void cetak(int[] newArray) {
        for (int f = 0; f < newArray.length; f++) {
            System.out.printf("%5d%8d\n", f, newArray[f]);



            int [] arrays={5 , 8 , 26 , 15 , 11 ,31 };
        }
    }

    public static int SequentialSearch(int[] cetaks, int c) {

        for (int i = 0; i <= cetaks.length - 1; i++) {
            if (c == cetaks[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] cetak, int a) {
        int l = 0;
        int r = cetak.length - 1;


        while (r >= l) {
            int mid = (r + l) / 2;

            if (cetak[mid] == a)
                return mid;

            if (cetak[mid] > a) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static int InterpolationSearch(int[] cetak, int a) {
        int l = 0;
        int h = cetak.length - 1;

        while (h >= l) {
            int mid = l + ((a - cetak[l]) * (h - l) / (cetak[h] - cetak[l]));

            if (cetak[mid] == a)
                return mid;

            if (cetak[mid] > a) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    /*public static void  Sorting(int[] cetakss) {

        for (int i = 1; i < cetakss.length; i++) {
            for (int j = 0; j < cetakss.length - 1- i; j++) {
                if (cetakss[j] > cetakss[j + 1]) {
                    int temp = cetakss[j];
                    cetakss[j] = cetakss[j + 1];
                    cetakss[j + 1] = temp;
                }
            }
        }
    }*/

    public static void BubbleSort(int []c){
        for(int i = 1; i <= c.length -1; i++){
            for(int element = 0 ; element <= c.length -1 - i; element++ ){
                if(c[element] > c[element + 1 ]){
                    int temp = c[element];
                    c[element]  = c[element + 1];
                    c[element + 1] = temp;
                }
            }
        }
    }

    public static void DescendingBubble(int [] cetakss){
        for(int i = 1 ; i<=cetakss.length; i++){
            for(int element = 0  ; element<= cetakss.length -1 -i; element++){
                if(cetakss[element] < cetakss[element + 1 ]){
                    int temp = cetakss[element];
                    cetakss[element] = cetakss[element + 1];
                    cetakss[element + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int [] cetakss){

            for(int i = 0 ; i<= cetakss.length - 2 ; i ++){
                int  mindIndex=i;
                for(int element = i + 1 ; element <= cetakss.length-1; element++){
                    if (cetakss[element] < cetakss[mindIndex] ){
                        mindIndex = element;
                        int swap = cetakss[mindIndex];
                        cetakss[mindIndex] = cetakss[i];
                        cetakss[i] = swap;
                    }
                }
            }
    }
}