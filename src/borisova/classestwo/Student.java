package borisova.classestwo;

public class Student {
    int id;
    String surname;
    String name;
    String middlename;
    String dof;
    String adress;
    String phone;
    String school;
    String clas;


    void info(){
        System.out.println(name + middlename + surname +" was born on " + dof + " and goes to " + school + "." + " He is in " + clas + " grade, and here is his information: Adress-" +  adress + ", Phone number-" + phone + ", Student id-" + id);
    }
}
