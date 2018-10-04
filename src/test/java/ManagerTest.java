import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.text.*;
//import java.text.SimpleDateFormat;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ManagerTest {
    CompanyManager companyManager;
    Employee employee;
    Company company;

    //aixo es pel warning amb log4j
    final Logger log = Logger.getLogger(Manager.class);

    @Before
    public void setUp(){

        this.companyManager = new Manager();

        this.companyManager.addCompany("EETAC", "UPC1");
        this.companyManager.addCompany("ESAB","UPC2");


        try {
            this.companyManager.addEmployee("Sergi", "Lucas",null, "EETAC", 120000);
            this.companyManager.addEmployee("Laura", "Millan", null, "EETAC", 80000);
            this.companyManager.addEmployee("David","Medel",null,"EETAC",150000);
            this.companyManager.addEmployee("Maribel","Mazo",null,"ESAB",30000);
            this.companyManager.addEmployee("Lucas","Lopez",null,"ESAB",50390);
            this.companyManager.addEmployee("Miki","Sanchez",null,"ESAB",77777);
        } catch (MyException e){
            log.warn("Error en els employees" +e.getMessage());
        }
    }
    @After
    public void tearDown()
    {
        this.companyManager = null;
    }
    @Test
    public void employees() {
        List<Employee> employeeList =this.companyManager.employees("EETAC");
        assertEquals(employeeList.get(0).name,"Sergi");
        assertEquals(employeeList.get(1).name,"Laura");
    }

    @Test
    public void findAllCompanies(){
        List<Company> companyList = this.companyManager.findAllCompanies();
        assertEquals(companyList.get(0).companyName,"EETAC");
        assertEquals(companyList.get(1).companyName,"ESAB");

    }

    @Test
    public void findAllEmployeesOrderedBySalary(){
        List<Employee> employeeList = this.companyManager.findAllEmployeesOrderedBySalary();
        assertEquals(employeeList.get(0).salary,30000,0.0);
        assertEquals(employeeList.get(1).salary,50390,0.0);
        assertEquals(employeeList.get(2).salary,77777,0.0);
        assertEquals(employeeList.get(3).salary,80000,0.0);
        assertEquals(employeeList.get(4).salary,120000,0.0);
        assertEquals(employeeList.get(5).salary,150000,0.0);
    }

    @Test
    public void findAllEmployeesOrderedByName(){
        List<Employee> employeeList3 = this.companyManager.findAllEmployeesOrderedByName();
        assertEquals(employeeList3.get(0).name,"David");
        assertEquals(employeeList3.get(1).name,"Laura");
        assertEquals(employeeList3.get(2).name,"Lucas");
        assertEquals(employeeList3.get(3).name,"Maribel");
        assertEquals(employeeList3.get(4).name,"Miki");
        assertEquals(employeeList3.get(5).name,"Sergi");
    }


}

