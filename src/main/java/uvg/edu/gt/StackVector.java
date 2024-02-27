package uvg.edu.gt;
/**
 * Esta clase es una implementacion de un Stack utilizando un Vector
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
import java.util.ArrayList;
import java.util.Vector;

public class StackVector<T> implements UVGStack<T>{
    private Vector<T> vector;
    public StackVector(){
        vector = new Vector<T>();
    }
    /**
     * Agrega un item al final del vector
     * @param item el item por agregar
     */
    public void push(T item){
        vector.add(item);
    }
    /**
     * Remueve el item al final del vector y lo retorna
     * @return el item al final del vector que fue removido
     */
    @Override
    public T pop() {
        T tempItem = vector.get(vector.size()-1);
        vector.remove(vector.size() - 1);
        return tempItem;
    }
    /**
     * Retorna el item al final del vector
     * @return el item al final del vector
     */
    @Override
    public T peek() {
        return vector.get(vector.size() - 1);
    }
    /**
     * Verifica si el vector esta vacio o no
     * @return true si esta vacio, false si contiene algun elemento
     */
    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }

}
