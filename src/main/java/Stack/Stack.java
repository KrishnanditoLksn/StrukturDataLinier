package Stack;

public class Stack {
    private final int[] Element;
    private int front, size;

    public Stack() {
        Element = new int[10];
        front = -1;
        size = 0;
    }


    public Stack(int x) {
        Element = new int[x];
        front = -1;
        size = 0;
    }

    public boolean push(int element) {
        if (Element.length != size) {
            front = front + 1;
            Element[front] = element;
            size++;
            return true;
        }
        return false;
    }

    public int pop() {
        if (!isEmpty()) {
            int temp = Element[front];
            front = front - 1;
            size--;
            return temp;
        } else {
            System.out.println("Kosong");
            return -1;
        }
    }

    public boolean isEmpty() {
        return front == 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < size; i++) {
            temp.append(Element[i]).append(" ");
        }
        return temp.toString();
    }
    /*
    stack object
     */

}