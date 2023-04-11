package Esercizi_OOP2._4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {


        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
           //Files.createFile(MY_PATH); L'ho dovuto commentare altrimenti generava errori

           Files.writeString(MY_PATH,myString);//Dove cazzo sta?


        } catch (Exception exception) {
            System.err.println("There was an error!");//genera un errore perchè ho caricato il file .txt nella cartella per la consegna
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {

            String file_txt = Files.readString(MY_PATH);
            System.out.println(file_txt);


        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

     /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");


        try {
        String file_txt = Files.readString(Paths.get("one_shots.txt"));// Write code here to read the file and return the number of lines "\n", string.split
            //Così in teoria funziona anche, però non sono convinto
            String[] fileCount=file_txt.split(" ");
            int lineCount = 0;

            for(String word : fileCount){

                if(word.contains("\n")){
                    lineCount++;
                }
            }
            System.out.println("Il numero di linee nel file è: "+lineCount);

            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     *
     * Then deletes the previous file with Files.delete() use inside the try block
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {
            String file_txt = Files.readString(MY_PATH);
            int totWord = file_txt.split(" ").length;
            System.out.println("Il numero di parole contenute nel file è : "+totWord);
            Files.delete(MY_PATH);



            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            Files.createDirectory(myDirectoryPath);                                                                               // Your code
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
    }
