package borisova.enumtasks;

public enum Days {
    Monday("Monday", 1),
    Tuesday("Tuesday", 2),
    Wednesday("Wednesday", 3),
    Thursday("Thursday", 4),
    Friday("Friday", 5),
    Saturday("Saturday", 6),
    Sunday("Sunday", 7);

    private String name;
    private int dayNumber;

    Days(String name, int dayNumber){
        this.name=name;
        this.dayNumber=dayNumber;
    }
    public String getName(){
        return name;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return dayNumber;
    }
}
