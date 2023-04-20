package borisova.classestwo;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Max";
        student1.id=001;
        student1.surname="Jameson";
        student1.middlename="Lax";
        student1.dof="10/20/2002";
        student1.adress="2390 Stringford St";
        student1.phone="954-265-3900";
        student1.school="Mayfield High";
        student1.clas="12th";

        student1.info();

        Student student2= new Student();
        student2.name="Kyle";
        student2.id=002;
        student2.surname="Alordi";
        student2.middlename="Den";
        student2.dof="04/12/2003";
        student2.adress="2291 Congress Ave";
        student2.phone="924-185-0340";
        student2.school="Mayfield High";
        student2.clas="11th";

        student2.info();
    }
}
