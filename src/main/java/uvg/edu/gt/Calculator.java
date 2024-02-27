package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Esta clase es un Singleton que transcribe operaciones infix a postfix y las evalua, tiene 2 factories
 * para crear stacks de diferentes tipos (caracteres y enteros) y toma un string como input sobre la estructura de datos
 * a ser utilizada
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.0
 * @since 26-02-2023
 */
public class Calculator {
    private static Calculator instance;
    private final String stackType;
    private StackFactory<Character> charStackFactory;
    private StackFactory<Integer> intStackFactory;

    /**
     * Constructor para la clase Calculator
     * @param stackType La estructura de datos a utilizar
     */
    Calculator(String stackType) {
        charStackFactory = new StackFactory<Character>();
        intStackFactory = new StackFactory<Integer>();
        this.stackType = stackType;
    }
    public static Calculator getInstance(String stackType){
        if (instance == null){
            instance = new Calculator(stackType);
        }
        return instance;
    }

    /**
     * Regresa un entero correspondiente a la precedencia del tipo de operacion a realizar
     * @param p el caracter que representa la operacion
     * @return un entero representando el valor de su importancia
     */
    private static int getPrecedence(char p) {
        switch (p) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    /**
     * Toma un String de operaciones escritas en Infix y las retorna en postfix
     * @param infix String de operaciones escritas en infix
     * @return operaciones escritas en postfix
     */
    public String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        UVGStack<Character> stack = charStackFactory.createStack(stackType);
        stack.push('#');
        for (char p : infix.toCharArray()) {
            if (Character.isDigit(p)) {
                postfix.append(p);
            } else if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                while (stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (stack.peek() != '#' && getPrecedence(p) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(p);
            }
        }
        while (stack.peek() != '#') {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    /**
     * Evalua una expresion escrita en postfix
     * @param op La operacion escrita en postfix
     * @return El valor resultante de la operacion
     */
    public int postfix(String op) {
        UVGStack<Integer> stack = intStackFactory.createStack(stackType);
        for (char p : op.toCharArray()) {
            if (Character.isDigit(p)) {
                stack.push(Integer.parseInt(String.valueOf(p)));
            } else if (!(p == ' ')) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                switch (p) {
                    case '+':
                        stack.push(n1 + n2);
                        break;
                    case '-':
                        stack.push(n2 - n1);
                        break;
                    case '*':
                        stack.push(n2 * n1);
                        break;
                    case '/':
                        stack.push(n2 / n1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    /**
     * Toma una expresion en infix, la pasa a postfix y la evalua
     * @param op la operacion en infix
     * @return el valor resultante de la operacion
     */
    public int eval(String op){
        return postfix(infixToPostfix(op));
    }

    /**
     * Lee un archivo llamado "datos.txt" y retorna un arraylists con todas las lineas del archivo como Strings
     * @return ArrayList de Strings
     */
    public ArrayList<String> readTxt() {
        ArrayList<String> tempList = new ArrayList<String>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            while ((line = br.readLine()) != null) {
                tempList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempList;
    }
}
