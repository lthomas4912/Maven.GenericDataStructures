package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E>  {

    private ArrayList<E> elements;


    public Stack() {
        elements = new ArrayList<>();
    }

    public Stack(ArrayList elements) {
        this.elements = elements;
        Stack<E> stacks = new Stack<>();
    }

    private void push(E nextElements) {
        elements.add((nextElements));

    }

    public E pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
            return elements.remove(elements.set());
        }

        public boolean isEmpty () {
            return elements.size() == 0;
        }
    }
}
