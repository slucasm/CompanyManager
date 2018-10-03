import java.util.*;


public abstract class Manager implements CompanyManager{

    protected HashMap<String,Company> HashMapCompanies = new HashMap<String, Company>();
    protected List<Employee> ListAllEmployees = new LinkedList<Employee>();

    public void addCompany(String companyName,String description)
    {
        Company company = new Company(companyName,description);
        HashMapCompanies.put(companyName,company);
    }

    public void addEmployee(String name, String surname, Date birthday, double salary, String companyName)
    {
        Company company = HashMapCompanies.get(companyName);
        Employee employee = new Employee(name,surname,birthday,companyName,salary);
        List<Employee> lista = company.getListaEmployee();
        lista.add(employee);
        ListAllEmployees.add(employee);
    }
    public List<Employee> findAllEmployeesOrderedByName()
    {
        List<Employee> ListEmployeesOrderedByName = new LinkedList<Employee>();
        for(Employee employee:ListAllEmployees)
        {
            ListEmployeesOrderedByName.add(employee);
        }
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