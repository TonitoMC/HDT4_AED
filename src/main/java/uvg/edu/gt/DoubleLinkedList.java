package uvg.edu.gt;
/**
 * Esta clase es un Double Linked List con los metodos necesarios para realizar la implementacion de un Stack
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public class DoubleLinkedList<T> implements UVGLList<T> {
    /**
     * Esta clase son los nodos utilizados en el double linked list
     */
    private class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node<T> head;
    private Node<T> tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * Agrega un dato al final del Double Linked List
     * @param item el dato por agregar
     */
    @Override
    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    /**
     * Remueve el dato al final del Double LInked list
     */
    @Override
    public void removeLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    /**
     * Retorna el dato al final del Double Linked List
     * @return el dato en la ultima posicion del Double Linked List
     */
    @Override
    public T getLast() {
        if (tail == null) {
            throw new IllegalStateException("List is empty");
        }
        return tail.data;
    }

    /**
     * Verifica si la lista esta vacia
     * @return false si tiene algun elemento, true de lo contrario
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
