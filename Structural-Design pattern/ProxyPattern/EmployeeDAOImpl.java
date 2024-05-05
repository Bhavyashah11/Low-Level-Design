package ProxyPattern;

public class EmployeeDAOImpl implements EmployeeDAO {
    
    @Override
    public void create(String client,EmployeeDo obj) throws Exception{
        // creates a new row
        System.out.println("New row created");
    }

    @Override
    public void delete(String client, int empid) throws Exception{
        System.out.println("Row deleted");
    }

    @Override
    public EmployeeDo get(String client, int empid) throws Exception{
        System.out.println("fetching data from db");
        return new EmployeeDo();
    
}}
