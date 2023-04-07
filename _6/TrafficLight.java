package Esercizi_OOP2._6;

public enum TrafficLight {

    RED,
    YELLOW,
    GREEN;



    public static void lightStatus (TrafficLight light){

        switch (light){

            case RED -> System.out.println(GREEN);
            case YELLOW -> System.out.println(RED);
            case GREEN -> System.out.println(YELLOW);
        }



    }






}
