package uvg.edu.gt;

import java.util.ArrayList;
import java.util.EmptyStackException;
/**
 * Esta clase es una implementacion de un Stack utilizando un ArrayList
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public class StackArrayList<T> implements UVGStack<T> {
    ArrayList<T> arrayList;

    public StackArrayList() {
        arrayList = new ArrayList<>();
    }

    /**
     * Agrega un item al final del arraylist
     * @param item el item por agregar
     */
    @Override
    public void push(T item) {
        arrayList.add(item);
    }

    /**
     * Remueve el item al final del arraylist y lo retorna
     * @return el item al final del arraylist que fue removido
     */
    @Override
    public T pop() {
        T tempItem = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return tempItem;
    }

    /**
     * Retorna el item al final del arraylist
     * @return el item al final del arraylist
     */
    @Override
    public T peek() {
        if (arrayList.isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.get(arrayList.size() - 1);
    }

    /**
     * Verifica si el stack esta vacio o no
     * @return true si esta vacio, false si contiene algun elemento
     */
    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

}
