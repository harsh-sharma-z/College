package endterm;

class Student
{
    String name;
    Student(String name)
    {
        this.name=name;
    }
    Student()
    {
        System.out.println("Unknown");
    }
}
public class ques4 {
    public static void main(String[] args) {

        Student obj=new Student("Harsh");
        System.out.println(obj.name);
    }
}
