package SDL_1;
public class Larik {

    public static void cetak(int[] newArray) {
        for (int f = 0; f < newArray.length; f++) {
            System.out.printf("%5d%8d\n", f, newArray[f]);
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

            if(cetak[mid] > a) {
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }

    public static int InterpolationSearch(int [] cetak , int a){
        int  l =0;
        int  h= cetak.length-1;

        while(h>=l){
            int mid = l+((a - cetak[l]) * (h -l) / (cetak[h] - cetak[l]));

            if(cetak[mid] == a)
                return  mid;

            if(cetak[mid] > a ){
                    h = mid -1;
            }
            else{
                l = mid + 1 ;
            }
        }
        return  -1;
    }
}
