package LinkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime, endTime, elapseTime;

        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        System.out.println("==========  Getting first element ==========");
        /******************* LinkedList **********************/
        startTime = System.nanoTime();
        linkedList.get(0);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapseTime + "ns");

        /******************* ArrayList **********************/
        startTime = System.nanoTime();
        arrayList.get(0);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapseTime + "ns");


        System.out.println("\n==========  Getting element in the middle ==========");
        /******************* LinkedList **********************/
        startTime = System.nanoTime();
        linkedList.get(500_000);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapseTime + "ns");

        /******************* ArrayList **********************/
        startTime = System.nanoTime();
        arrayList.get(500_000);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapseTime + "ns");


        System.out.println("\n==========  Getting the last element ==========");
        /******************* LinkedList **********************/
        startTime = System.nanoTime();
        linkedList.get(1_000_000 - 1);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapseTime + "ns");

        /******************* ArrayList **********************/
        startTime = System.nanoTime();
        arrayList.get(1_000_000 - 1);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapseTime + "ns");
    }    
}
