package endterm;
import java.util.*;
class ques7 {
    int age;

    ques7(int age) {
        if (age < 0) {
            this.age = 0;
            System.out.println("AGE IS NOT VALID!");

        } else
            this.age = age;
    }

    public void yearpasses() {
        age++;
    }

    public void IamOld() {
        if (age < 13)
            System.out.println("You are young.");
        else if (age >= 13 && age <= 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        ques7 obj = new ques7(age);
        obj.IamOld();
        System.out.println("After 3 years....");
        for (int i = 0; i < 3; i++)
            obj.yearpasses();
        obj.IamOld();
    }
}
