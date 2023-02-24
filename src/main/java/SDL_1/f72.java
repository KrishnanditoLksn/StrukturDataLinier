package SDL_1;

public class f72 {
    public static void main(String[]args){
        int c []= new int[10];

        System.out.printf("\"%s%8s\n" , "Index", "Value");


        for(int i  = 0 ;  i<c.length; i++){
            System.out.printf("%5d%8d\n", i , c[i]);
        }
    }
}
