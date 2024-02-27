package uvg.edu.gt;
/**
 * Esta clase es una implementacion de un Stack utilizando linked lists, pueden ser dobles o singles
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public class StackLL<T> implements UVGStack<T>{
    private UVGLList<T> stack;
    private LListFactory<T> listFactory;

    /**
     * Crea una lista enlazada doble o single dependiendo del parametro Type
     * @param type el tipo de lista enlazada por utilizar
     */
    public StackLL(String type){
        listFactory = new LListFactory<>();
        stack = listFactory.createList(type);
    }

    /**
     * Agrega un item al final de la lista
     * @param item el item por agregar
     */
    @Override
    public void push(T item) {
        stack.addLast(item);
    }

    /**
     * Remueve el item al final de la lista y lo retorna
     * @return el item que fue removido
     */
    @Override
    public T pop() {
        T tempItem = stack.getLast();
        stack.removeLast();
        return tempItem;
    }

    /**
     * Retorna el item al final de la lista
     * @return el item al final de la lista
     */
    @Override
    public T peek() {
        return stack.getLast();
    }

    /**
     * Verifica si el stack esta vacio
     * @return true si esta vacio, false si contiene elementos
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}