import java.util.LinkedList;


public class Company extends Manager {

    private String companyName, description;
    private LinkedList<Employee> listaEmployee = new LinkedList<Employee>();

    public Company(String companyName,String description)
    {
        this.companyName = companyName;
        this.description = description;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    public String getCompanyName()
    {
        return companyName;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
    }
    public void setListaEmployee(LinkedList<Employee> listaEmployee)
    {
        this.listaEmployee = listaEmployee;
    }
    public LinkedList<Employee> getListaEmployee()
    {
        return listaEmployee;
    }
}
