class Person{
    String name;
    String id;

    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    String grade;
    String department;

    public Student(String name){
        super(name);
    }
}


public class UpcastingEx {
    public static void main(String []args){
        Person p;
        Student s= new Student("이재훈");
         p=s;

       //오류 없음
       s.grade = "A";

       //컴파일 오류
        //p.grade = "A";

        //컴파일 오류
        //p.department = "Com";
    }
}
