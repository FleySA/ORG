package com.telran.org.lesson_8;
// КОд для добавления нового элемента в начало нашего списка LinkedList
public class MyLinkedList {

    private Node head = null;

    public void add(int data) {
        Node node = new Node(data, null);
        if (head == null){
            head = node;
            return;
        }

        node.setNext(head);
        head = node;
    }
    // metod dobavleniya elementa v konec spiska
    // 8 -> 3 -> 4 -> 2 -> 15 (15 berem iz TestMyLinkedList - list.pushToTail(15);)
    public void pushToTail(int data){
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node node = head; // golova spiska , to est - 8
        while (node.getNext() != null){ // цикл доходит до последнего элемента и останавливается на последнем эл-те.
            node = node.getNext();
        }

        node.setNext(newNode);
        System.out.println(node);

    }
    // 8 -> 3 -> 4 -> 2  - metod obxoda svyazannogo spiska
    public void print() {

        Node node = head;
        while( node != null){
            System.out.print(node.getData() + "    ");
            node = node.getNext();

        }
        System.out.println();
    }
}
