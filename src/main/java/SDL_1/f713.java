package SDL_1;

public class f713 {
    public static void main(String[]args){
        int []arrays={110 , 111 , 112, 113, 114};

        System.out.printf("Effect of passing reference to entire array : %n" + "The values of the original array are :%n");

        for(int v : arrays)
            System.out.printf(" %d " ,v);

        modifikasiArr(arrays);
        System.out.printf("%n%n The values of the modified array are in  : %n");

        for(int v : arrays)
            System.out.printf(" %d ",v);

        System.out.printf("%n%nEffects of passing array element value in :%n"   + "array[3] before modifyElement:%d%%n",arrays[3]);

        modifikasiElemen(arrays[3]);
        System.out.printf("Array [3] before modify element: %d%n",arrays[3]);

    }
    public static  void modifikasiArr(int []arrays2){
        for(int c =  0 ; c < arrays2.length; c++){
            arrays2[c] *= 2 ;
        }
    }
    public static void modifikasiElemen(int elemen){
        elemen *= 2 ;
        System.out.printf("Value of element in modElement : %d%n" , elemen);
    }
}
