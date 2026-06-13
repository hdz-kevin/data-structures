import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    
    public static void main(String[] args) {
        /**
         *
         * Queue (Cola) => FIFO. First In, First Out
         * 
         * Es una estructura de datos lineal diseñada para contener elementos antes de su procesamiento.
         * 
         * Ejemplo: una fila de personas (el primero en llegar es el primero en ser atendido)
         * 
         * 
         *     ----------------------------------------------------------
         *   <-    Karen    <-    Chad    <-    Steve    <-    Harold    <-
         *     ----------------------------------------------------------
         *      Head/Cabeza                                  Tail/Cola
         * 
         * 
         * Operaciones principales:
         * - enqueue = offer(): agregar un nuevo objeto al final de la cola (tail)
         * - dequeue = poll(): eliminar el objeto al principio de la cola (head)
         * - peek: obtener el head de la cola sin eliminarlo
         */

        // En Java, Queue es una interface, por tanto, no puede ser instanciada
        // LinkedList implementa Queue, así que tiene el comportamiento de una Cola
        Queue<String> queue = new LinkedList<String>();

        // Enqueue/Agregar elementos a la cola
        queue.offer("Karen"); // Head
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold"); // Tail

        System.out.println(queue); // [Karen, Chad, Steve, Harold]

        // Acceder al objeto en el head de la cola sin eliminarlo
        System.out.println(queue.peek()); // Karen

        // Dequeue/Remover el elemento head actual en la cola
        System.out.println("Removed head: " + queue.poll()); // Karen
        System.out.println("Removed head: " + queue.poll()); // Chad
        System.out.println("Removed head: " + queue.poll()); // Steve

        System.out.println(queue); // [Harold]


        /**
         * Usos de Colas
         * 
         * Se utilizan principalmente para gestionar datos que deben procesarce en el orden de llegada
         * 
         * - Gestión de tareas: los OS usan colas para organizar tareas y procesos pendientes
         * - Keyboard Buffer: los carácteres aparecen en el orden en que fueron presionados
         * - Impresión de documentos: los documentos se colocan en una cola y se procesan secuencialmente
         */
    }
    
}
