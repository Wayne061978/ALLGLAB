package GLAB_303_11_5;

import java.util.TreeSet;

public class TreeSetExampleTwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);


       // Example three:
        // first() and last() Methods

        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(2);
        numbers1.add(5);
        numbers1.add(6);
        System.out.println("TreeSet: " + numbers1);

        int first = numbers1.first();
        System.out.println("First Number: " + first);

        int last = numbers1.last();
        System.out.println("Last Number: " + last);



    }
}


