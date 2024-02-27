package uvg.edu.gt;
/**
 * Esta interfaz es utilizada por las Linked Lists, sean singles o doubles deben contener estos metodos
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public interface UVGLList<T> {
    public void addLast(T item);
    public void removeLast();
    public T getLast();
    public boolean isEmpty();
}