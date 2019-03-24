package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements;
    private Integer count = 0;


    public Stack() {
        this.elements = new ArrayList<>();
    }

    public Stack(ArrayList elements) {
        this.elements = elements;
    }

    public void push(E nextElements) {
        elements.add(nextElements);
    }


    public ArrayList<E> pop() {
        if (!elements.isEmpty()) {
            elements = (ArrayList<E>) elements.get(count);
            elements.remove(elements);
            count--;
        }else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
            return elements;
        }
        public boolean isEmpty() {
            return elements.size() == 0;
        }

}
