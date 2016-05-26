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

    Nodo head;
    int size;

    public Lista() {
        size = 0;
    }

    public Lista(Object value) {
        head = new Nodo(value);
        size = 1;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo value) {
        head = value;
    }

    public void insert(Object value, int position) {
        if (position >= 0 && position < size) {

            Nodo current = head;
            if (position == 0) {
                this.setHead(new Nodo(value));
                head.setNext(current);
            } else {
                for (int i = 0; i < position - 1; i++) {
                    current = current.getNext();
                }

                if (current.hasNext() == false) {
                    current.setNext((new Nodo(value)));
                } else {
                    Nodo second = current.getNext();
                    current.setNext(new Nodo(value));
                    current.getNext().setNext(second);
                }
            }
            size++;
        }
    }

    public int getSize() {
        return size;
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

    public Nodo at(int position) {
        Nodo current = head;

        for (int i = 0; i < size; i++) {
            if (i == position) {
                return current;
            }

            current = current.getNext();
        }
        return null;
    }

    public Object get(int position) {
        Nodo current = head;

        for (int i = 0; i < size; i++) {
            if (i == position) {
                return current.getValue();
            }

            current = current.getNext();
        }
        return -1;
    }

    public Object first() {
        return head.getValue();
    }

    public void concat(Lista nueva) {
        Nodo current = head;
        while (current.hasNext()) {
            current = current.getNext();
        }

        current.setNext(nueva.getHead());
        size = size + nueva.getSize();
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
        if (position >= 0 && position < size) {
            if (position == 0) {
                this.setHead(head.getNext());
            } else if (position == size - 1) {
                this.at(size - 2).setNext(null);
            } else {
                Nodo current = head;

                for (int i = 0; i < position - 1; i++) {
                    current = current.getNext();
                }

                Nodo second = current.getNext().getNext();
                current.setNext(second);

            }
            size--;
        }
    }
}
