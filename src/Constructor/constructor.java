package Constructor;

class Student{
    String name;
    int age;
    Student(Student s1){
        this.name=s1.name;
        this.age= s1.age;
    }

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Student() {

    }
}
public class constructor {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name ="Arooj";
    s1.age = 20;
    Student s2 = new Student(s1);
    s2.info();
    }
}
