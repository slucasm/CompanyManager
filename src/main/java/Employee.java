import java.util.Date;
import java.util.List;

public class Employee {

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
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }
    public Date getBirthday()
    {
        return birthday;
    }
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    public String getCompanyName()
    {
        return companyName;
    }
    public void setSalary (double salary)
    {
        this.salary = salary;
    }
    public double getSalary()
    {
        return salary;
    }



}
