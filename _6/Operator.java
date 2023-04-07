package Esercizi_OOP2._6;

public enum Operator {

    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;


public static void operations (Double num1,Operator operator,Double num2){

    switch (operator){

        case ADD -> System.out.println(num1+num2);
        case SUBTRACT -> System.out.println(num1-num2);
        case MULTIPLY -> System.out.println(num1*num2);
        case DIVIDE -> System.out.println(num1/num2);

    }



}







}
