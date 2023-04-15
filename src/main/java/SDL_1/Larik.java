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

    public static void BubbleSort(int[] c) {
        for (int i = 1; i <= c.length - 1; i++) {
            for (int element = 0; element <= c.length - 1 - i; element++) {
                if (c[element] > c[element + 1]) {
                    int temp = c[element];
                    c[element] = c[element + 1];
                    c[element + 1] = temp;
                }
            }
        }
    }

    public static void DescendingBubble(int[] cetakss) {
        for (int i = 1; i <= cetakss.length; i++) {
            for (int element = 0; element <= cetakss.length - 1 - i; element++) {
                if (cetakss[element] < cetakss[element + 1]) {
                    int temp = cetakss[element];
                    cetakss[element] = cetakss[element + 1];
                    cetakss[element + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] cetakss) {

        for (int i = 0; i <= cetakss.length - 2; i++) {
            int mindIndex = i;
            for (int element = i + 1; element <= cetakss.length - 1; element++) {
                if (cetakss[element] < cetakss[mindIndex]) {
                    mindIndex = element;
                    int swap = cetakss[mindIndex];
                    cetakss[mindIndex] = cetakss[i];
                    cetakss[i] = swap;
                }
            }
        }
    }

    public static void DescendingSelection(int[] cetakss) {
        for (int i = 0; i <= cetakss.length - 2; i++) {
            int minIndex = i;
            for (int element = i + 1; element <= cetakss.length - 1; element++) {
                if (cetakss[element] > cetakss[minIndex]) {
                    minIndex = element;
                    int swap = cetakss[minIndex];
                    cetakss[minIndex] = cetakss[i];
                    cetakss[i] = swap;
                }
            }
        }
    }

    public static void InsertionSort(int[] cetaks) {
        int n = cetaks.length;
        int iteration;
        int index;

        for (iteration = 1; iteration < n; iteration++) {
            int key = cetaks[iteration];
            index = iteration - 1;

            while (index >= 0 && cetaks[index] > key) {
                cetaks[index + 1] = cetaks[index];
                index = index - 1;
            }
            cetaks[index + 1] = key;
        }
    }


    public static void InsertionDescending(int[] cetakks) {
        int n = cetakks.length;
        int iteration;
        int index;

        for (iteration = 1; iteration < n; iteration++) {
            int key = cetakks[iteration];
            index = iteration - 1;

            while (index >= 0 && cetakks[index] < key) {
                cetakks[index + 1] = cetakks[index];
                index = index - 1;
            }
            cetakks[index + 1] = key;
        }
    }

    public static void quicksort(int[] x){
        Larik.quickSort(x,0 , x.length-1);
    }

    private static void quickSort(int[] x, int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1;
            int j = akhir;


            while (i <= akhir && x[i] <= x[awal]) {
                i++;
            }
            while (j > awal && x[j] > x[awal]) {
                j--;
            }

            while (i < j) {
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                while (i <= akhir && x[i] <= x[awal]) {
                    i = i + 1;
                }
                while (j > awal && x[j] > x[awal]) {
                    j = j - 1;
                }
            }
            int swap = x[awal];
            x[awal] = x[j];
            x[j] = swap;

            Larik.quickSort(x, awal, j - 1);
            Larik.quickSort(x, j + 1, akhir);
        }
    }
    private static void quickSortDescending(int[] x, int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1;
            int j = akhir;


            while (i <= akhir && x[i] >= x[awal]) {
                i++;
            }
            while (j > awal && x[j] < x[awal]) {
                j--;
            }

            while (i < j) {
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                while (i <= akhir && x[i] >= x[awal]) {
                    i = i + 1;
                }
                while (j > awal && x[j] < x[awal]) {
                    j = j - 1;
                }
            }
            int swap = x[awal];
            x[awal] = x[j];
            x[j] = swap;

            Larik.quickSort(x, awal, j - 1);
            Larik.quickSort(x, j + 1, akhir);
        }
    }

}
