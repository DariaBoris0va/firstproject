package borisova.lambda;

import java.util.function.Function;

public class tst1 {
    public static void main(String[] args) {
        Function<String, String> f1= s->s+"-f1-";
        Function<String, String> f2= s->s+"-f2-";
        Function<String, String> f3= s->s+"-f3-";
        System.out.println(f1.andThen(f3).compose(f2).apply("Compose"));
        System.out.println(f1.andThen(f2).andThen(f3).apply("AndThen"));
    }
}
//    List<Person> list=getPerson();
//        for (Person person : list) {
//            System.out.println(person);
//        }
//        list.sort((Person person1, Person person2)->person1.getAge()-person2.getAge());
//        list.forEach((person)->System.out.println(person));
//
//    }
//    private static List<Person> getPerson(){
//        List<Person> result = new ArrayList<Person>();
//
//        result.add(new Person("Jack", 12));
//        result.add(new Person("Layla", 16));
//        result.add(new Person("Paul", 14));
//        result.add(new Person("Sasha", 19));
//
//        return result;
