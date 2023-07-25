package Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack tumpukan  = new Stack();
        tumpukan.push(1);
        tumpukan.push(26);
        tumpukan.push(56);


        System.out.println("Ukuran : " + tumpukan.size() + " => " + tumpukan.toString());
        if(tumpukan.isEmpty())
            System.out.println("Data sudah habis ");

        else
            System.out.println("Ukuran : " + tumpukan.size() + " => "  + tumpukan.toString());


        int e = tumpukan.pop();
        System.out.println("Data yang di pop " + e);


        if(tumpukan.isEmpty())
            System.out.println("Data sudah habis ");

        else
            System.out.println("Ukuran : " + tumpukan.size() + " => "  + tumpukan.toString());


        tumpukan.push(56);

        if(tumpukan.isEmpty())
            System.out.println("Data sudah habis ");

        else
            System.out.println("Ukuran : " + tumpukan.size() + " => "  + tumpukan.toString());


        if(tumpukan.isEmpty())
            System.out.println("Data sudah habis ");

        else
            System.out.println("Ukuran : " + tumpukan.size() + " => "  + tumpukan.toString());


    }
}
