package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class Lista {
    Nodo head=null;
    int size=0;

    public Lista() {
        head=null;
    }

    public Lista(Object value) {
        head = new Nodo(value);
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo value) {
        head = value;
    }
    
      public int getSize() {
        return size;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    

    public void insert(Object value, int position) {
        if (head != null) {
            if (position == 0 || position >= 0 && position <= size) {
                int current = 0;
                Nodo actual = head;
                Nodo next;
                if (position > 0) {
                    while (current != position - 1) {
                        actual = actual.getNext();
                        current++;
                    }
                    Nodo olderNext = actual.getNext();
                    next = new Nodo(value);
                    actual.setNext(new Nodo(value));
                    next.setNext(olderNext);
                    size++;
                } else if (position == 0) {
                    next = head;
                    setHead(new Nodo(value));
                    head.setNext(next);
                    size++;
                }
            }
        } else {
            head = new Nodo(value);
            size++;
        }
    }

  

    public int find(Object value) {
        Nodo current = head;
        for (int i = 0; i < size; i++) {
            if (current.getValue() == value) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    public Object at(int position) {
        Nodo current = head;
        for (int i = 0; i < size; i++) {
            if (i == position) {
                return current.getValue();
            }

            current = current.getNext();
        }
        return null;
    }

    public Object first() {
        return head.getValue();
    }

    public void concat(Lista nueva) {
        size += nueva.getSize();
        insert(nueva.getHead(), 0);
    }

    public void push(Object value) {
        if (size == 0) {
            this.setHead(new Nodo(value));
        } else if (head.hasNext() == true) {
            Nodo current = head;

            while (current.hasNext()) {
                current = current.getNext();
            }

            current.setNext(new Nodo(value));
        } else {
            head.setNext(new Nodo(value));
        }
        size++;
    }

    public void remove(int position) {
        if (head != null) {
            if (position == 0 || position > 0 && position < size) {
                int current = 0;
                Nodo actual = head;
                if (position > 0) {
                    while (current < position - 1) {
                        actual = actual.getNext();
                        current++;
                    }
                    if (actual.hasNext()) {
                        actual.setNext(actual.getNext().getNext());
                        size--;
                    } else {
                        actual = null;
                        size--;
                    }
                } else {
                    setHead(head.getNext());
                    size--;
                }
            }
        }
    }
}
