package SDL_1;

public class f73 {
    public static void main(String[]args){
        int arrau[]={100 , 101 , 102 ,103 , 104 , 105 , 106 , 107};

        System.out.printf("%s%8s\n" , "Index", "Value");

        for(int a = 0 ; a<arrau.length; a++){
            System.out.printf("%5d%8d\n" , a , arrau[a]);
        }
    }
}
