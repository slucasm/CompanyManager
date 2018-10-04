import java.util.Date;
import java.util.List;

public interface CompanyManager {

    public void addCompany(String companyName, String description);
    public void addEmployee(String name, String surname, Date birthday, String companyName,double salary) throws MyException;
    public List<Employee> findAllEmployeesOrderedByName();
    public List<Employee> findAllEmployeesOrderedBySalary();
    public List<Employee> employees(String companyName);
    public List<Company> findAllCompanies();

}
