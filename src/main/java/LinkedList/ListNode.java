package LinkedList;

class ListNode  {

    Object Element;
    ListNode previous;
    ListNode next;

    Object getElement() {
        return Element;
    }

    ListNode() {}

    ListNode(int element) {
        this.next = null;
        this.previous = null;
    }

    ListNode(Object element) {
        this.Element = element;
        this.next = null;
        this.previous = null;
    }

    ListNode(int element, ListNode next, ListNode previous) {
        this.Element = element;
        this.next = next;
        this.previous = previous;
    }

    ListNode(Object element, ListNode next, ListNode previous) {
        this.Element = element;
        this.next = next;
        this.previous = previous;
    }
}