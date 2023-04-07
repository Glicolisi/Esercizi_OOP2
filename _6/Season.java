package Esercizi_OOP2._6;

import java.util.Arrays;
import java.util.List;

public enum Season {
    SPRING("March, April, May, June,"),
    SUMMER("June, July, August, September"),
    FALL("September, October, November December"),
    WINTER("November, December,January, February");

    private String months;


    Season(String months) {
        this.months = months;
    }

    public String getMonths() {
        return months;
    }
}

//January, February, March, April, May, June, July, August, September, October, November and December
