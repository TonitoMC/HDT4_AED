package uvg.edu.gt;

import java.util.Scanner;

/**
 * Este programa lee un archivo de texto con notacion infix, lo transcribe a postfix y lo evalua
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.0
 * @since 26-02-2023
 */

public class App 
{
    public static void main(String[] args) {
        boolean mainBool = true;
        String stackType = null;
        while (mainBool) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el numero correspondiente a la estructura de datos que desea utilizar:");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Single Linked List");
            System.out.println("4. Double Linked List");
            int mainSelect = scanner.nextInt();
            /**
             * Switch case para la seleccion de estructura de datos a utilizar
             */
            switch (mainSelect) {
                case 1:
                    stackType = "arraylist";
                    mainBool = false;
                    break;
                case 2:
                    stackType = "vector";
                    mainBool = false;
                    break;
                case 3:
                    stackType = "single";
                    mainBool = false;
                    break;
                case 4:
                    stackType = "double";
                    mainBool = false;
                    break;
                default:
                    System.out.println("Valor ingresado incorrecto");
            }
        }
        Calculator calc = Calculator.getInstance(stackType);
        for (String p : calc.readTxt()){
            System.out.println(calc.eval(p));
        }
    }
}