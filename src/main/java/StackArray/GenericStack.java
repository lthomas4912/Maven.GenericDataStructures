package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int size;

    public GenericStack() {
        elements = (E[]) new Object[10];
        size = 0;

    }
    public void push(E object){
        if(size != elements.length){
            elements[size] = object;
        } else{
            elements = doubleSize();
        }
        size++;
    }

    private E[] doubleSize() {
        E[] result = (E[]) new Object[elements.length*2];
        for (int i = 0; i < elements.length; i++) {
            result[i] = elements[i];
        }
        return result;
    }

    public E pop(){
        E result = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return result;
    }

    public boolean isEmpty(){
        if(elements.length == 0){
            return true;
        } else {
            return false;
        }
    }
}
