package java;

public class main {

    Student student1 = new Student();
    Student student2 = new Student();

    public void init() {


        student1.setName("Jack");
        student1.setAge(30);
        student1.setGender("Male");
        student1.setIDNo(10001);

        student2.setName("Rose");
        student2.setAge(25);
        student2.setGender("Female");
        student2.setIDNo(10002);
    }

    public main() {
        init();

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getGender());
        System.out.println(student1.getIDNo());

        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getGender());
        System.out.println(student2.getIDNo());
    }
}
