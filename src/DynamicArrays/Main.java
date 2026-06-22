package DynamicArrays;

public class Main {
    
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        System.out.println(dynamicArray);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");

        System.out.println(dynamicArray);
        dynamicArray.insert(0, "X");

        System.out.println(dynamicArray);
        System.out.println("Empty: " + dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);

        System.out.println("Deleting A...");
        System.out.println(dynamicArray);
        dynamicArray.delete("A");
        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);

        System.out.println("\nSearching D: " + dynamicArray.search("D"));
        System.out.println("Searching Y: " + dynamicArray.search("Y"));

        System.out.println("\nShrink");
        System.out.println(dynamicArray);
        dynamicArray.delete("X");
        System.out.println(dynamicArray);
    }
}
