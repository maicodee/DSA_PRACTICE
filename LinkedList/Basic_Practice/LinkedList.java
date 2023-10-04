// THIS GOES IN YOUR MAIN CLASS TO TEST YOUR CODE:
// -----------------------------------------------

// package datastructures.linkedlist;

// public class Main {

//     public static void main(String[] args) {

//         LinkedList myLinkedList = new LinkedList(4);

//         myLinkedList.getHead();
//         myLinkedList.getTail();
//         myLinkedList.getLength();

//         System.out.println("\nLinked List:");
//         myLinkedList.printList();

//         /*
//             EXPECTED OUTPUT:
//             ----------------
//             Head: 4
//             Tail: 4
//             Length: 1

//             Linked List:
//             4

//         */

//     }

// }

package LinkedList.Basic_Practice;

class LinkedList {

    // Declaration of variables of linked list

    private Node head;
    private Node tail;
    private int length;

    // Creation of the Node
    class Node {

        int value;
        Node next;

        Node(int Value) {
            this.value = Value;
        }

    }

    // Constructor of the LinkedList Class
    public LinkedList(int value) {

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    // Method to print the list
    public void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    // Method to get the Head of the list
    public void getHead() {

        System.out.println("Head = " + head.value);
    }

    // Method to get the Tail of the list
    public void getTail() {

        System.out.println("Tail = " + tail.value);
    }

    // Method to get the length of the list
    public void getLength() {

        System.out.println("Length = " + length);
    }

    // Method to add new value to the list
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Method to Remove last node
    public void removeLast(){
        
    }

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();

    }
}