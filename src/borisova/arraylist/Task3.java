package borisova.arraylist;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Student> girlStudents = new ArrayList<>();
        Student girl1 = new Student("Julia", "Helfer", 1);
        girlStudents.add(girl1);
        Student girl2 = new Student("Maya", "Robinson", 2);
        girlStudents.add(girl2);
        Student girl3 = new Student("Becca", "Stamer", 3);
        girlStudents.add(girl3);
        Student girl4 = new Student("Ashley", "Micelson", 4);
        girlStudents.add(girl4);
        Student girl5 = new Student("Hannah", "Wenman", 5);
        girlStudents.add(girl5);

        ArrayList<Student> boyStudents = new ArrayList<>();
        Student boy1=new Student("James", "Patrikson", 3);
        boyStudents.add(boy1);
        Student boy2=new Student("John","Stevenson", 2);
        boyStudents.add(boy2);
        Student boy3=new Student("Logan","Walker", 1);
        boyStudents.add(boy3);
        Student boy4=new Student("Gabe", "Emrik", 4);
        boyStudents.add(boy4);
        Student boy5=new Student("Lucas", "Bastian", 5);
        boyStudents.add(boy5);

        System.out.println(girlStudents.size());
        Collections.sort(boyStudents);
        System.out.println(boyStudents);
        System.out.println(boyStudents.get(4));
    }
}
