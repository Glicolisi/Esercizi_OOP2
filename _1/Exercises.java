package Esercizi_OOP2._1;

import java.util.*;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1:
     * <p>
     * 1. Add some numbers (1, 1, 5, 2, 1) to the set using the add() method.
     * 2. Remove '1' from  the set using the .remove(1)
     * 3. Print the set again to confirm the element was removed.
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        Set<Integer> ourSet = new HashSet<>();

        // Add some numbers using the add method
        ourSet.add(1);
        ourSet.add(1);
        ourSet.add(5);
        ourSet.add(2);
        ourSet.add(1);

        //Ho modificato Set.of perchè in origine era Set.of(1,1,5,2) e il numero ripetuto generavo un errore nel codice
        if (ourSet.containsAll(Set.of(4, 5, 2, 1))) {
            System.out.println("1a. Set contains all numbers");
        } else {
            System.out.println("1a. Set does not contain all numbers");
        }

        System.out.println(ourSet);

        // Remove the element '1'
        ourSet.remove(1);

        System.out.println(ourSet);

        if (ourSet.contains(1)) {
            System.out.println("1b. The set still contains 1");
        } else {
            System.out.println("1b. The set does not contain 1");
        }
    }

    /**
     * 2:
     * <p>
     * Read the comments below and write comments on what you think our print statement will output!
     */
    private static void exercise2() {
        System.out.println("Exercise 2: ");
        Set<String> fruitsSet = new HashSet<>();

        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        fruitsSet.add("kiwi");
        fruitsSet.add("mango");

        fruitsSet.addAll(fruitsSet);

        //2a. What will this output? [apple,banana,orange,kiwi,mango in un ordine predefinito ma non intuibile a priori]
        System.out.println(fruitsSet);

        List<String> fruitsList = List.of("apple", "banana", "grapes", "pear", "mango");

        fruitsSet.addAll(fruitsList);

        //2b. What will this output? [agiungerà gli elementi non ancora presenti della lista al set:pear, mango, grapes]
        System.out.println(fruitsSet);
    }

    /**
     * 3: Write code to solve the following problems
     */
    private static void exercise3() {
        System.out.println("Exercise 3: ");

        // 3a. Find the min and max values in the Set below
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        //Non so se è fatto apposta o meno, ma l'esercizio si risolverebbe immediatamente se i valori di max e min fossero invertiti o se non fosse necessario un unico ciclo
        //Nel dubbio non ho toccato min e max e ho fatto quella porcheria con l'array
        int[]inversione=new int[2];

        for (Integer number : numbers) {

            if (number<=max) {
          max=number;
          inversione[0]=max;
          }
            if (number>=min){
          min=number;
          inversione[1]=min;
            }
        }
        min=inversione[0];
        max=inversione[1];


        if (max != 10 || min != 1) {
            System.out.println("3a. Incorrect min or max values");
        }else {
            System.out.println("3a. Correct min and max values");
        }

        // 3b. Find which items from set a are also in set b, add these to itemsContainedInBothSets
        //     use the `contains` method and "nested" for loop
        Set<Integer> setA = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> setB = Set.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Set<Integer> itemsContainedInBothSets = new HashSet<>();

        for (Integer IntegerA : setA){

            for (Integer IntegerB : setB){

                if (IntegerA.equals(IntegerB)){

                    itemsContainedInBothSets.add(IntegerA);

                }

            }

        }


        if (!itemsContainedInBothSets.equals(Set.of(5, 6, 7, 8, 9, 10))) {
            System.out.println("3b. Incorrect number of items in itemsContainedInBothSets");
        } else {
            System.out.println("3b. Correct number of items in itemsContainedInBothSets");
        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     */
    private static void exercise4() {
        System.out.println("Exercise 4: ");

        Set<Integer> orderedNumbers = new TreeSet<>();
        orderedNumbers.addAll(Set.of(5, 3, 1, 2, 4, 6, 7, 8, 9, 10));

        // 4a. Find the min value in the TreeSet with as few loops as possible,
        //     you can use `break;` to exit the loop once you've found it!




        // Non so se ho inteso bene l'esercizio, se per loops intende numero di iterazione del ciclo o cicli innestati, nel secondo caso è banale, basta fare come nell'esercizio precedente
        // Nel primo caso dovrebbe essere sufficente stampare il primo numero di ordered number perchè per l'appunto sono ordinati,non servirebbe neanche un ciclo;
        int min = Integer.MAX_VALUE;
        int count=0;
        //caso banale
        /*for(Integer number : orderedNumbers){
            if(number<=min){
                min=number;
            }
        }*/

        for (Integer number : orderedNumbers){

            if(number<=min){

                min=number;
                count++;
                break;
            }

        }


        System.out.println(count);
        if (min != 1) {
            System.out.println("4a. Incorrect min value");
        } else {
            System.out.println("4a. Correct min value");
        }
    }
}
