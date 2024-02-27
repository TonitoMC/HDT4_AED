package uvg.edu.gt;
/**
 * Esta clase es un factory para listas enlazadas, crea double linked lists o single linked lists.
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public class LListFactory<T> {
    public UVGLList<T> createList(String type){
        switch (type){
            case "single":
                return new SingleLinkedList<T>();
            case "double":
                return new DoubleLinkedList<T>();
            default:
                return null;
        }
    }
}