import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Stack
         * 
         * Estructura de Datos lineal basada en el principio LIFO (Last In, First Out),
         * donde el último elemento añadido es el primero en ser eliminado.
         * 
         * Operaciones Principales:
         * push: Agregar un elemento al stack
         * pop: Eliminar el elemento superior del stack
         * peek: Obtener el elemento superior sin eliminarlo
         * empty: Verifica si el stack está vacío o no
         * size: Obtener el tamaño del stack
         * 
         * Usos de Stack
         * Deshacer y rehacer (Undo/Redo) en editores de texto
         * Historial de navegación en browsers (<- ->)
         * Gestión de llamadas en funciones (Call Stack)
         */

        Stack<String> stack = new Stack<String>();

        // Agregar elementos al stack (inserta cada uno en la parte superior)
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // Comprobar si el stack está vacío
        System.out.println("Is empty: " + stack.empty());

        System.out.println(stack);

        // // Eliminar y obtener el elemento superior
        // String topGame = stack.pop();
        // System.out.println("Top game: " + topGame);
        // System.out.println(stack);

        // // Acceder al elemento superior sin eliminarlo
        // System.out.println(stack.peek());
        // System.out.println(stack);

        // Buscar un elemento
        // Retorna la posición del elemento (basada en 1) desde la parte superior
        // El elemento superior es la posición 1
        System.out.println(stack.search("FFVII")); // 1
        System.out.println(stack.search("DOOM")); // 3
        System.out.println(stack.search("Not Exists")); // -1

        // Esto puede causar una exepción OutOfMemoryError, que ocurre cuando el espacio en la memoria heap
        // no es suficiente para crear un objeto.
        for (int i = 0; i < 1000_000_000; i++) {
            stack.push("Fallout76");
        }

        System.out.println(stack);
    }
}
