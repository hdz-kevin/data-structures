package DynamicArrays;

import java.util.Arrays;

/**
 * Esta clase representa el funcionamiento y las operaciones principales de un DynamicArray o ArregloDinamico.
 * Tiene una capacidad dinámica, es decir, no tiene un límite en cuanto a la cantidad de elementos que pueda
 * contener, su capacidad aumenta o disminuye automáticamente a medida que se vayan insertando o eliminando
 * elementos.
 * 
 * Operaciones/Métodos principales:
 *   add(Object item)                -  Agrega un nuevo elemento al final
 *   insert(int index, Object item)  -  Inserta un nuevo elemento en un índice específico
 *   delete(Object item)             -  Elimina un elemento del array
 *   search(Object item)             -  Busca un elemento, retornando su índice en el array o -1 si no existe
 *   isEmpty()                       -  Comprueba si el array está vacio
 */
public class DynamicArray {
    /**
     * El tamaño actual del array. Es la cantidad de elementos que se han ingresado.
     */
    int size = 0;

    /**
     * La capacidad del array. Es la capacidad máxima actual que aumenta o disminuye dinámicamente.
     */
    int capacity = 10;

    /**
     * Un arreglo estandar de capacidad estática usado internamente para almacenar los elementos.
     */
    Object[] array;

    /**
     * Instancia un nuevo DynamicArray con una capacidad inicial por defecto de 10.
     */
    public DynamicArray() {
        this.array = new Object[this.capacity];
    }

    /**
     * Crea una nueva instancia con una capacidad inicial específica
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

    /**
     * Inserta un nuevo elemento en un índice específico en el array, desplazando hacía la derecha
     * los elementos necesarios.
     *
     * @param index
     * @param item
     */
    public void insert(int index, Object item) {
        // Desplazar hacía la derecha los elementos posteriores al índice.
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
     * Elimina el item y desplaza los elementos posteriores hacia la izquierda para rellenar el espacio.
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

    /**
     * Busca un elemento y retorna su índice, si el elemento no existe retorna -1.
     * 
     * @param item
     */
    public int search(Object item) {
        for (int i = 0; i < size; i++) {
            if (this.array[i] == item) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Incrementa la capacidad del array al doble de su capacidad actual, manteniendo los elementos
     * que contiene hasta el momento.
     */
    void grow() {
        int newCapacity = (int) (this.capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }

        this.capacity = newCapacity;
        this.array = newArray;
    }

    /**
     * Acorta la capacidad del array a la mitad, mantieniendo los elementos que contiene hasta el momento.
     */
    private void shrink() {
        int newCapacity = (int) (this.capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }

        this.capacity = newCapacity;
        this.array = newArray;
    }

    /**
     * Comprueba si el arreglo está vacio
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
