import java.util.*;
import org.apache.log4j.Logger;

public class Manager implements CompanyManager{

    private HashMap<String,Company> HashMapCompanies = new HashMap<String, Company>();
    private List<Employee> ListAllEmployees = new LinkedList<Employee>();

    final Logger log = Logger.getLogger(MyException.class);

    public void addCompany(String companyName,String description)
    {
        Company company = new Company(companyName,description);
        HashMapCompanies.put(companyName,company);
    }

    public void addEmployee(String name, String surname, Date birthday, String companyName, double salary) throws MyException {
        Company theCompany = this.HashMapCompanies.get(companyName);
        if (theCompany==null) throw new MyException();

        //If it isn't null, we have to add it
        Employee e = new Employee(name, surname,birthday,salary,companyName);
        this.ListAllEmployees.add(e);
        theCompany.addEmployee(e);
    }

    public List<Employee> findAllEmployeesOrderedByName() {
        List<Employee> ListEmployeesOrderedByName = new LinkedList<Employee>();
        ListEmployeesOrderedByName.addAll(this.ListAllEmployees);
        Collections.sort(ListEmployeesOrderedByName, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return ListEmployeesOrderedByName;
    }
    public List<Employee> findAllEmployeesOrderedBySalary()
    {
        List<Employee> ListEmployeesOrderedBySalary = new LinkedList<Employee>();
        for(Employee employee:ListAllEmployees)
        {
            ListEmployeesOrderedBySalary.add(employee);
        }
        Collections.sort(ListEmployeesOrderedBySalary, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {

                return (int)(o1.getSalary()-o2.getSalary());
            }
        });
        return ListEmployeesOrderedBySalary;
    }
    public List<Employee> employees(String companyName)
    {
        Company ccompany = HashMapCompanies.get(companyName);
        List<Employee> lista = ccompany.getListaEmployee();
        return lista;
    }
    public List<Company> findAllCompanies()
    {
        List<Company> listacompanies= new LinkedList<Company>();
        for(String clave : HashMapCompanies.keySet())
        {
            listacompanies.add(HashMapCompanies.get(clave));
        }
        return listacompanies;
    }




}