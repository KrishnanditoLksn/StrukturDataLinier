package LinkedList;

import java.util.NoSuchElementException;

public class LinkedListt {
    private  int size;
    private ListNode head;

    public LinkedListt(){
        head = new ListNode();
        head.next = head;
        head.previous = head;
        size = 0;
    }

    private void addBefore(int a , ListNode bantuuu){
        ListNode baru;
      /* 1*/  baru = new ListNode(a);
      /*2*/  baru.next = bantuuu;
       /*3*/ baru.previous = bantuuu.previous;
       /*4*/ bantuuu.previous.next = baru;
        /*5 */ bantuuu.previous = baru;
        size ++;
    }

    private void addBefore(Object a , ListNode bantuuu){
        ListNode baru;
        baru = new ListNode(a);
        baru.next = bantuuu;
        baru.previous = bantuuu.previous;
        bantuuu.previous.next = baru;
        bantuuu.previous = baru;
        size ++;
    }

    public void addFirst( Object element){
        addBefore(element , head.next);
    }

    public void addLast(Object element){
        addBefore(element , head);
    }

    public void addFirst(int element){
        addBefore(element , head.next);
    }

    public int size(){
        return  size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

   public void addLast(int element ){
        addBefore(element , head);
    }

    public Object remove(ListNode bantu){
        if (bantu == head){
            throw  new NoSuchElementException();
        }
        bantu.previous.next = bantu.next;
        bantu.next.previous = bantu.previous;
        size --;
        return  bantu;
    }

    /*public void  cetak(){
        ListNode bantu;
        bantu = head.next;
        while (!(bantu == head)){
            System.out.println(bantu.element);
            System.out.println();
            bantu  = bantu.next;
        }
    }*/

    @Override
    public String toString(){
        String temp = "";

        ListNode bantu;
        bantu = head.next;
        while (!(bantu == head)){
            temp  += bantu.Element + " ";
            bantu = bantu.next;
        }
        return temp;
    }

    public ListNode search(Object x){
        ListNode bantu;
        bantu  = head.next;

        while (bantu != head){
            if (((Comparable)x).compareTo(bantu.getElement()) == 0){
                return  bantu;
            }
            else  {
                bantu = bantu.next;
            }
        }return  null;
    }

    public Object removeFirst(){
        return  remove(head.next);
    }

    public Object removeLast(){
        return  remove(head.previous);
    }
}