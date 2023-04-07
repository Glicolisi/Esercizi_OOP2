package Esercizi_OOP2._6;

public enum Days {
    MOONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private Boolean isWeekend;

    Days(Boolean isWeekend) {
        this.isWeekend = isWeekend;

    }

    public Boolean getWeekend() {
        return isWeekend;
    }

    public void setWeekend(Boolean weekend) {
        isWeekend = weekend;
    }














}
