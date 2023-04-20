package borisova.enumtasks;

public class DayOfWeek {
    private String title;
    public DayOfWeek(String title){
        this.title=title;
    }

    public static void main(String[] args) {
        DayOfWeek dayofweek= new DayOfWeek("Saturday");
        System.out.println(dayofweek);
    }
    @Override
    public String toString(){
        return "DayOfWeek{" + "title='" + title + '\'' + '}';
    }


}
