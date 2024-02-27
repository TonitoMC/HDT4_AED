package uvg.edu.gt;
/**
 * Esta clase es un factory para stacks, crea stacks implementando vectores, arraylists y linked lists.
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public class StackFactory<T> {
    public UVGStack<T> createStack(String type){
        switch (type){
            case "vector":
                return new StackVector<T>();
            case "arraylist":
                return new StackArrayList<T>();
            case "double":
                return new StackLL<T>("double");
            case "single":
                return new StackLL<T>("single");
            default:
                return null;
        }
    }
}