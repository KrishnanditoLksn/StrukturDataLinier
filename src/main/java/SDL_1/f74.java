package SDL_1;

public class f74 {
    public static void main(String[]args){
        final int ARRAY_LENGTH = 10;
        int array[] = new int[ARRAY_LENGTH];

        for(int c = 0  ; c < array.length; c++)
            array[c] = 2 + 2 * c;

        System.out.printf("%s%8s\n" , "Index" , "Value");

        for(int c = 0 ; c  < array.length ; c++)
            System.out.printf("%5d%8d\n" , c , array[c]);
    }

}
