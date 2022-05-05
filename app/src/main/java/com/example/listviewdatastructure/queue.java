/*
First in, first out - insert at end remove at beginning
Includes insert, delete, looking
    - able to insert at tail and delete at head
*/
package com.example.listviewdatastructure;

public class queue
{
    //variables
    private Node head;
    private Node tail;
    private int size;

    //constructor
    public queue()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int newData)
    {
        tail = new Node(newData, tail);
    }

    public int getSize()
    {
        Node position = tail;
        while(position != null)
        {
            size++;
            position = position.getLink();
        }
        return size;
    }

    public int getHead()
    {
        Node position = tail;
        while(position != null)
        {
            head = position;
            position = position.getLink();
        }
        return head.getData();
    }

    public int getTail()
    {
        return tail.getData();
    }

    public int data(int count)
    {
        Node position = tail;
        for(int i = 0; i < count; i++)
        {
            position = position.getLink();
        }
        return position.getData();
    }

    public void remove()
    {

        Node current = tail;
        Node next = tail.next;
        while (next.next != null)
        {
            current = next;
            next = next.next;
        }
        current.next = null;
        head = current;
    }

    public void showList()
    {
        Node position = tail;
        while(position != null)
        {
            System.out.print(position.getData() + " ");
            position = position.getLink();
        }
    }

    private class Node
    {
        public int data;
        private Node next;

        //constructor
        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public void setNextNode(Node node)
        {
            this.next = node;
        }

        public Node getLink()
        {
            return this.next;
        }

        public int getData()
        {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", link=" + next +
                    '}';
        }
    }//end node
}//end queue