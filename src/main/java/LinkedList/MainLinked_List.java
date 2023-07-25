package LinkedList;

import SDL_1.Mhs;

public class MainLinked_List {
    public static void main(String[] args) {
        Mhs[] data = new Mhs[5];
        data[0] = new Mhs(432423, "SDIRO");
        data[1] = new Mhs(321321, "Dito");
        data[2] = new Mhs(3213123, "Aldi");
        data[3] = new Mhs(31231232, "JOKO");
        data[4] = new Mhs(312312, "Abdul");

        LinkedListt linkedList = new LinkedListt();
        //ListNode hasil = linkedList.search(1);
        //if(hasil !=null)
        //{System.out.println("Elemen " +  hasil.getElement() +  " ada ");}

        //else
        //{System.out.println("Tidak ada");}

        Object one = data[0];
        linkedList.addFirst(one);
        //linkedList.cetak();
        divide();

        try {
            System.out.println("dawdasdasd" + linkedList.removeLast());
            System.out.println("wfawfawdf" + linkedList.removeLast());
            System.out.println("wdawdadw" + linkedList.removeFirst());
            System.out.println("Dawdawd" + linkedList.removeFirst());
            System.out.println("dawdaswdas" + linkedList.removeFirst());
            System.out.println("Dwdaws" + linkedList.removeFirst());
        } catch (Exception e) {
            System.out.println("List Kosong masbro");
        }
    }

    private static void divide() {
        System.out.println("-----------------------------");
    }
}
