package com.bootcoding.dsa.linklist;

public class LinklistExample2 {
    public static void main(String[] args) {
        Node head= new Node();
        head.data=10;
        head.next=null;
        Node current=head;
        for (int i=1; i<=10;i++){
            Node n1=new Node();
            n1.data=i*10;
           // n1.next=null;
            current.next=n1; //Assign new element to the next of current element
            current=current.next; //Shift to next element

        }
        current=head.next;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}
