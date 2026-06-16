import java.util.Stack;

public class Stacks {
    public static void main(String[] args) throws Exception {

        /**
         * Stack
         * 
         * Estructura de Datos lineal basada en el principio LIFO (Last In, First Out),
         * donde el último elemento añadido es el primero en ser eliminado.
         * 
         * Operaciones Principales:
         *  push: Agregar un elemento al stack
         *  pop: Eliminar el elemento superior del stack
         *  peek: Obtener el elemento superior sin eliminarlo
         *  empty: Verifica si el stack está vacío o no
         *  size: Obtener el tamaño del stack
         * 
         * Usos de Stacks:
         *  Deshacer y rehacer (Undo/Redo) en editores de texto
         *  Historial de navegación en browsers (<- ->)
         *  Gestión de llamadas en funciones (Call Stack)
         */

        Stack<String> games = new Stack<String>();

        // Agregar elementos al stack (inserta cada uno en la parte superior)
        games.push("Minecraft");
        games.push("Skyrim");
        games.push("DOOM");
        games.push("Borderlands");
        games.push("FFVII");

        // Comprobar si el stack está vacío
        System.out.println("Is empty: " + games.empty());

        System.out.println(games);

        // Eliminar y obtener el elemento superior
        String topGame = games.pop();
        System.out.println("Top game: " + topGame);
        System.out.println(games);

        // Acceder al elemento superior sin eliminarlo
        System.out.println(games.peek());
        System.out.println(games);



        /** Buscar elementos en un Stack */

        Stack<String> languages = new Stack<String>();
        languages.push("Java");
        languages.push("Python");
        languages.push("C++");
        languages.push("Rust");

        System.out.println(languages); // [Java, Python, C++, Rust]

        // Retorna la posición del elemento (1-based) desde la parte superior
        // El elemento superior es la posición 1
        System.out.println(languages.search("Rust")); // 1
        System.out.println(languages.search("Python")); // 3

        // Para elementos que no existen retorna -1
        System.out.println(languages.search("PHP")); // -1



        // Esto puede causar una exepción OutOfMemoryError, que ocurre cuando el espacio en la memoria heap
        // no es suficiente para crear un objeto.
        // for (int i = 0; i < 1000_000_000; i++) {
        //     languages.push("Go");
        // }
    }
}
