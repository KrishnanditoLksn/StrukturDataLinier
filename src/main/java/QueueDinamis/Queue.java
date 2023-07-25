package QueueDinamis;
import LinkedList.LinkedListt;
import java.util.NoSuchElementException;

public class Queue {
    LinkedListt antrian;

    public Queue(){
        antrian = new LinkedListt();
    }

    public boolean enqueue(Object x) {
        antrian.addLast(x);
        return  true;
    }

    public Object dequeue(){
        if (antrian.isEmpty()){
            throw  new NoSuchElementException();
        }
       return antrian.removeFirst();
    }

    public boolean isEmpty(){
        return antrian.isEmpty();
    }

    public String toString(){
        return antrian.toString();
    }
}
