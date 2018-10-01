import java.util.Date;

public abstract class Employee implements CompanyManager {

    String name, surname, companyName;
    double salary;
    Date birthday;

    public Employee(String name,String surname, Date birthday,String companyName,double salary)
    {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.companyName = companyName;
        this.salary = salary;
    }
    public void addEmployee(String name, String surname, Date birthday, double salary, String companyName)
    {

    }



}
