import java.util.LinkedList;
import java.util.List;


public class Company extends Manager {

    private String companyName, description;
    private List<Employee> listaEmployee = new LinkedList<Employee>();

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
    public void setListaEmployee(List<Employee> listaEmployee)
    {
        this.listaEmployee = listaEmployee;
    }
    public List<Employee> getListaEmployee()
    {
        return listaEmployee;
    }
}
