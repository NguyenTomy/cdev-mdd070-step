package list_linkedlist;

import java.util.Iterator;

public class LinkedMaList implements MaList {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    @Override
    public void add(String valeur) {
        if (first == null) {
            first = new Node();
            first.setValeur(valeur);
            last = first;
        } else {
            Node newLast = new Node();
            newLast.setValeur(valeur);

            last.setNext(newLast);

            this.last = newLast;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int position, String valeur) {
        // TODO
        Node node = new Node();
        node.setValeur(valeur);
        node.setNext(null);

        if (this.first == null) {
            //if head is null and position is zero then exit.
            if (position != 0) {
                return;
            } else { //node set to the head.
                this.first = node;
            }
        }

        if (first != null && position == 0) {
            node.setNext(this.first);
            this.first = node;
            return;
        }

        Node current = this.first;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.getNext();

            if (current == null) {
                break;
            }

            i++;
        }

        node.setNext(current);
        previous.setNext(node);
    }

    @Override
    public String get(int position) {
        // TODO
        return null;
    }

    @Override
    public Iterator<String> iterator() {
        // TODO
        return new LinkedListIterator(first);
    }

}
