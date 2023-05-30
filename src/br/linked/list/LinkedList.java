package br.linked.list;

public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value);

        if(this.first == null & this.last == null) {
            this.first = node;
            this.last = node;
        }

        if(this.first != null & this.last != null) {
            this.last.setNext(node);
            this.last = node;
        }

        this.size++;
    }

    public void remove(T value) {
        Node<T> previous = null;
        Node<T> current = this.first;
        for(int i = 0; i < this.getSize(); i++) {
            if(current.getValue().equals(value)) {
                if(size == 1) {
                  this.first = null;
                  this.last = null;
                }

                if(current != this.first && current != this.last) {
                    previous.setNext(current.getNext());
                    current = null;
                }

                if(current == this.first) {
                    this.first = current.getNext();
                    current.setNext(null);
                }

                if(current == this.last) {
                    this.last = previous;
                    previous.setNext(null);
                }
                this.size--;
                break;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public String get(int index) {
       Node<T> current = this.first;
       for(int i = 0; i < index; i++) {
            if(current.hasNext()) {
                current = current.getNext();
            }
       }

       return current.getValue();
    }
}
