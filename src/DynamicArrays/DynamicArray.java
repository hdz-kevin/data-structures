package DynamicArrays;

import java.util.Arrays;

public class DynamicArray {
    /** The total of non-null elements within static array */
    int size = 0;
    /** The current capacity of the static array */
    int capacity = 10;
    /** Static array where the elements are stored */
    Object[] array;

    /**
     * Instance a DynamicArray with default initial capacity
     */
    public DynamicArray() {
        this.array = new Object[this.capacity];
    }

    /**
     * Instance a DynamicArray with a custom initial capacity
     * 
     * @param initialCapacity
     */
    public DynamicArray(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Invalid initial capacity: " + initialCapacity);
        }

        this.capacity = initialCapacity;
        this.array = new Object[initialCapacity];
    }

    /**
     * Inserta un nuevo elemento al final del array
     * 
     * @param item
     */
    public void add(Object item) {
        this.array[this.size] = item;
        this.size++;

        if (this.size == this.capacity) {
            System.out.println("Capacity reached!!");
            this.grow();
        }
    }

    public void insert(int index, Object item) {
        for (int i = this.size; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }

        this.array[index] = item;
        this.size++;

        if (this.size == this.capacity) {
            this.grow();
        }
    }

    /**
     * Elimina el item y desplaza los elementos posteriores hacia la izquierda
     * para rellenar el espacio.
     * 
     * @param item
     */
    public void delete(Object item) {
        int index = -1;
        
        // Buscar el índice del item
        for (int i = 0; i < size; i++) {
            if (this.array[i] == item) {
                index = i;
                break;
            }
        }

        if (index == -1) return;

        // Desplazar hacia la izquierda los elementos después del índice
        for (int i = index; i < size; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.size--;

        // Acortar el array interno
        if (size <= (int) (capacity / 3)) {
            this.shrink();
        }
    }

    public int search(Object item) {
        for (int i = 0; i < size; i++) {
            if (this.array[i] == item) {
                return i;
            }
        }

        return -1;
    }

    void grow() {
        int newCapacity = (int) (this.capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }

        this.capacity = newCapacity;
        this.array = newArray;
    }

    private void shrink() {
        int newCapacity = (int) (this.capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }

        this.capacity = newCapacity;
        this.array = newArray;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
