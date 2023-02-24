package SDL_1;

public class f75 {
    public static void main(String[]args){
        int array[]={67 ,120 , 100, 105 , 106 , 107 , 108 , 1000 , 1002};

        int total = 0;

        for(int i =  0 ; i < array.length ; i++)
            total+=array[i];
        System.out.printf("Total array dalam elemen  : %d\n" , total);
    }
}
