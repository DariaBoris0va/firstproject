package borisova.arraylist;

public class Student implements Comparable<Student>{

        String name;
        String lastname;
        int id;

        public String getName () {
            return name;
        }
        public void setName(String name){
                this.name=name;
        }
        public String getLastname(){
                return lastname;
        }
        public void setLastname(String lastname){
                this.lastname=lastname;
        }
        public int getId(){
                return id;
        }
        public void setId(int id){
                this.id=id;
        }

        public Student(String name, String lastname, int id) {
                this.name = name;
                this.lastname = lastname;
                this.id = id;
        }

        @Override
        public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", lastname='" + lastname + '\'' +
                        ", id=" + id +
                        '}';
        }

        @Override
        public int compareTo(Student o) {
                int differenceName = this.name.compareTo(o.name);
                int differenceLastName = this.lastname.compareTo(o.lastname);
                int differenceId = this.id - o.id;
                if(differenceId != 0) {
                        return differenceId;
                }
                if(differenceName != 0){
                        return differenceName;
                }
                return differenceLastName;
        }
}
