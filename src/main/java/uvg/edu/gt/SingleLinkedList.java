package uvg.edu.gt;
/**
 * Esta clase es un Single Linked List con los metodos necesarios para realizar la implementacion de un Stack
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public class SingleLinkedList<T> implements UVGLList<T>{
    private class Node<T>{
        public T data;
        public Node<T> next = null;
        public Node(T cData){
            data = cData;
        }
    }
    private Node<T> head = null;
    /**
     * Agrega un dato al final del Double Linked List
     * @param item el dato por agregar
     */
    @Override
    public void addLast(T item) {
        Node <T> newNode = new Node<T>(item);
        if (head == null){
            head = newNode;
        } else {
            Node <T> curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    /**
     * Remueve el dato al final del Double LInked list
     */
    @Override
    public void removeLast() {
        if (head.next == null){
            head = null;
            return;
        }
        Node <T> curr = head;
        Node <T> prev = null;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }
    /**
     * Retorna el dato al final del Double Linked List
     * @return el dato en la ultima posicion del Double Linked List
     */
    @Override
    public T getLast() {
        Node <T> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        return curr.data;
    }
    /**
     * Verifica si la lista esta vacia
     * @return false si tiene algun elemento, true de lo contrario
     */
    @Override
    public boolean isEmpty() {
        return (head == null);
    }
}
