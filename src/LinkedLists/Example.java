package LinkedLists;

import java.util.LinkedList;

public class Example {
    
    public static void main(String[] args) {
        /**
         * LinkedList
         * 
         *  Almacena una serie de Nodos, los cuales se encuentran en direcciones de memoria no consecutivas y
         *  se componen por dos partes:
         *    - El dato que nos interesa almacenar
         *    - Un puntero hacía el siguiente Nodo
         * 
         *                                          Singly Linked List
         *                         Node                    Node                    Node
         *                  [object | pointer]  ->  [object | pointer]  ->  [object | pointer]
         * 
         * 
         *  En el caso de las Listas Doblemente Enlazadas, cada Nodo conoce la dirección del Nodo previo y del siguiente
         *  (almacena dos punteros), además de almacenar su dato correspondiente.
         * 
         *                                          Doubly Linked List
         *               Node                               Node                               Node
         *   [pointer | object | pointer]  <->  [pointer | object | pointer]  <->  [pointer | object | pointer]
         * 
         *  
         *  Ventajas:
         *    - Estructura de datos dinámica (asigna la memoria necesaria en tiempo de ejecución)
         *    - Operaciones de Insertar y Eliminar eficientes O(1)
         *    - Cero/Bajo desperdicio de memoria
         * 
         *  Desventajas
         *    - Mayor uso de memoria para el o los punteros adicionales
         *    - No soporta acceso aleatorio de elementos (sin índices como en arrays [i])
         *    - Acceso/Búsqueda de elementos es menos eficiente O(n)
         */


        /**
         * LinkedList implementa la interface Deque "double ended queue (deck)", el cual soporta las operaciones de Stack y Queue a
         * la vez, es decir, permite agregar, remover y obtener elementos desde cualquier extremo.
         * 
         * Por tanto, LinkedList puede ser tratado ya sea como un Stack o como un Queue
         */

        System.out.println("\n* Usando LinkedList como un Stack");
        LinkedList<String> notes = new LinkedList<String>();
        
        notes.push("A");
        notes.push("B");
        notes.push("C");
        notes.push("D");
        notes.push("F");

        System.out.println(notes);  // [F, D, C, B, A]

        System.out.println(notes.pop());  // F
        System.out.println(notes);  // [D, C, B, A]


        System.out.println("\n* Usando LinkedList como un Queue");
        LinkedList<String> grades = new LinkedList<String>();

        grades.offer("A");
        grades.offer("B");
        grades.offer("C");
        grades.offer("D");
        grades.offer("F");

        System.out.println(grades);  // [A, B, C, D, F]

        System.out.println(grades.poll());  // A
        System.out.println(grades);  // [B, C, D, F]


        System.out.println("\n* Insertar elementos en una posición específica");

        LinkedList<String> grades2 = new LinkedList<String>();
        grades2.offer("A");
        grades2.offer("B");
        grades2.offer("C");
        grades2.offer("D");
        grades2.offer("F");

        System.out.println(grades2);  // [A, B, C, D, F]

        // Simplemente le pasamos el índice del nuevo objeto y le objeto en sí
        grades2.add(4, "E");
        System.out.println(grades2);  // [A, B, C, D, E, F]

        System.out.println("\n* Remover un elemento");

        // Se puede eliminar por indice u objeto
        grades2.remove("E");
        System.out.println(grades2);


        /**
         * Los Listas Enlazadas tienen ventaja sobre los arrays a la hora de insertar o remover elementos.
         * Sin embargo, no soportan acceso aleatorio por índice como los arrays o array lists.
         */

        
        System.out.println("\n * Buscar elementos (obtener el índice de un objeto)");
        System.out.println("   F -> " + grades2.indexOf("D"));
        

        System.out.println("\n * Acceder al Head y Tail sin eliminarlos");
        System.out.println("   Head: " + grades2.peekFirst());
        System.out.println("   Tail: " + grades2.peekLast());
    }
    
}
