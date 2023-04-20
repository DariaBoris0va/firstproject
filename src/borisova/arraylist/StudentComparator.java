package borisova.arraylist;

import java.util.Comparator;
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int difNames = o1.getName().compareTo(o2.getName());
        int difLastName = o1.getLastname().compareTo(o2.getLastname());
        int difId = o1.getId() - o2.getId();
        if(difNames != 0){
            return difNames;
        }
        if(difLastName != 0){
            return difLastName;
        }
            return difId;
    }
}
