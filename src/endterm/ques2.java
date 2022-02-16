package endterm;

 class Member{
    String name,add;
    int age, salary;
    long ph;
    Member (String name, int age, long ph, String add,int salary)
    {
        this.name=name;
        this.add=add;
        this.age=age;
        this.salary=salary;
        this.ph=ph;
    }

    public void printSalary ()
    {
        System.out.println("Salary of the employee is=$"+salary);
    }
}

class employee extends Member
{
    String specialization;
    employee (String name, int age, long ph, String add,int salary, String specialization) {
        super(name, age, ph, add, salary);
        this.specialization = specialization;

    }

    public void printsalary()
        {
            System.out.println("Salary of the employee is=$"+salary);
        }
    }

class manager extends Member{
    String deptt;
    manager(String name, int age, long ph, String add,int salary, String deptt )
    {
        super(name, age, ph, add, salary);
        this.deptt=deptt;
    }

    public void printsalary()
    {
        System.out.println("Salary of the employee is=$"+salary);
    }
}
public class ques2 {
    public static void main(String[] args) {
        employee majdoor=new employee("Umang",22,956894512,"Gla Hostel",10000,"Testing");
        manager maalik=new manager ("Harsh",18,89,"Anandvan.Mathura",100000,"HR");
        majdoor.printSalary();
        maalik.printsalary();
    }
}
