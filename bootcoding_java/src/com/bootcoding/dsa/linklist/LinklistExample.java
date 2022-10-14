package com.bootcoding.dsa.linklist;

public class LinklistExample {


    public static void main(String[] args) {
        Node n1= new Node();
        n1.data=10;
        n1.next=null;

        Node n2=new Node();
        n2.data=20;
        n2.next=null;

        n1.next=n2;
        Node head=n1;
        Node current=head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}
