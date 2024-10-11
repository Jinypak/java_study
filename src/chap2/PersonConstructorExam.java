package chap2;

public class PersonConstructorExam {

    public static void main(String[] args) {
        PersonConstructor person = new PersonConstructor();
        PersonConstructor person2 = new PersonConstructor("Lee");
        
        System.out.println("=======================");
        System.out.println(person);
        System.out.println(person.getName());
        person.setName("Park");
        System.out.println(person.getName());
        // System.out.println(person.weight()); 접근 불가
        System.out.println("=======================");
        System.out.println(person2);
        System.out.println(person2.name);
        person2.setName("Lee 2");
        System.out.println(person2.getName());
        System.out.println("=======================");
    }
}
