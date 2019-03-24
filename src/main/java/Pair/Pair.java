package Pair;

import java.util.Comparator;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {
    private E first;
    private E second;

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }
//getters
    public E getFirst(){
        return first;
    }

    public E getSecond(){
        return second;
    }
    //compare methods for max and min using ternary operator
    public E min(){
        return first.compareTo(second) < 0 ? first : second;
    }

    public E max(){
        return first.compareTo(second) > 0 ? first : second;
    }
}
