import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {

        /**
         * Priority Queue
         * 
         * Una estructura de datos que procesa los elementos según su prioridad, en lugar del orden de inserción (FIFO).
         * 
         * Los elementos se ordenan y son tratados según su orden natural. Por defecto, los valores menores tienen mayor
         * prioridad y son procesados primero que los valores mayores.
         */


        System.out.println("=============== Queue ================");

        // Una Queue normal mantiene el orden en que fueron insertado los elementos.

        Queue<Double> queue = new LinkedList<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (! queue.isEmpty()) {
            System.out.println(queue.poll());
        }



        System.out.println("\n=============== Priority Queue ================");

        /**
         * PriorityQueue ordena los elementos según su orden natural; de menor a mayor para tipos numéricos,
         * osea de forma Ascendente.
         */
        
        Queue<Double> pQueue = new PriorityQueue<>();
        pQueue.offer(3.0);
        pQueue.offer(2.5);
        pQueue.offer(4.0);
        pQueue.offer(1.5);
        pQueue.offer(2.0);

        while (! pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }



        System.out.println("\n=============== Reverse Priority Queue ================");

        /** Modificar el orden de Ascendente a Descendente */

        Queue<Integer> ages = new PriorityQueue<>(Collections.reverseOrder());
        ages.offer(30);
        ages.offer(18);
        ages.offer(22);
        ages.offer(45);
        ages.offer(29);

        while (! ages.isEmpty()) {
            System.out.println(ages.poll());
        }




        System.out.println("\n=============== Priority Queue of Strings ================");

        /**
         * Priority Queues de Strings ordena los elementos de forma alfabética
         */

        Queue<String> notes = new PriorityQueue<>();
        notes.offer("B");
        notes.offer("C");
        notes.offer("A");
        notes.offer("F");
        notes.offer("D");

        while (! notes.isEmpty()) {
            System.out.println(notes.poll());
        }

    }
}
