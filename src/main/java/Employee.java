import java.util.Date;

public abstract class Employee implements CompanyManager {

    String name, surname, companyName;
    double salary;
    Date birthday;

    public void addEmploye(String name,String surname, Date birthday,String companyName,double Salary)
    {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.companyName = companyName;
        this.salary = salary;
    }

    
}
