package Stack;

public class Stack_1 {
    private  int [] Element;
    private int front;
    private int size;


    public Stack_1(){
         Element = new int[10];
         front = -1;
         size = 0;

    }

    public Stack_1(int x ){
        Element  = new int[x];
        front = -1;
        size = 0;
    }
    public void push(int a ){
        if(Element.length == size){
            System.out.println("The Stack is full");
        }
        else {
             front++;
             Element[front] = a;
        }
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public int pop(){
        if(!isEmpty()){
            int temp =  Element[front];
            front--;
            Element[front] = temp;
            return  temp;
        }
        else {
            System.out.println("dawdawd");
        }
        return -1;
    }

    public int size(){
        return Element.length;
    }

    public String toString(){
        return  "Froent " +front;
    }


    public static void main(String[] args) {
        Stack_1 stack1 = new Stack_1();
        stack1.push(2);
        stack1.push(1);
        int a = stack1.pop();

        if(stack1.isEmpty()){
            System.out.println("habis");
        }
        else {
            System.out.println(stack1.size + stack1.toString());
        }

        System.out.println("Popped data is " + a);
    }

}
