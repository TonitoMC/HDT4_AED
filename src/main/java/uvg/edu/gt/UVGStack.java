package uvg.edu.gt;

import java.util.ArrayList;
/**
 * Esta interfaz es utilizada para Stacks
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public interface UVGStack <T>{
    public void push(T item);
    public T pop();
    public T peek();
    public boolean isEmpty();
}