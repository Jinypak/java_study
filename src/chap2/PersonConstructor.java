package chap2;

public class PersonConstructor {
    public String name = "John Doe";
    public float height;
    private float weight = 70;

    public PersonConstructor(){
        System.out.println("Default 생성자 함수 동작");
    }
    public PersonConstructor(String value){
        System.out.println("Custom 생성자 함수 동작");
        name = value;
        System.out.println(weight);
    }

    String getName(){
        return name;
    }

    void setName(String value) {
        name = value;
    }

}
