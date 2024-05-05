package ProxyPattern;

public class EmployeeDAOProxy  implements EmployeeDAO{
    
    EmployeeDAOImpl employeeDAOImpl;
    EmployeeDAOProxy(){
        employeeDAOImpl = new EmployeeDAOImpl();
    }
    @Override
    public void create(String client,EmployeeDo obj) throws Exception{
        // creates a new row
       if(client.equals("ADMIN"))
       employeeDAOImpl.create(client, obj);
       else throw new Exception("Access denied");
    }

    @Override
    public void delete(String client, int empid) throws Exception{
        if(client.equals("ADMIN"))
        employeeDAOImpl.delete(client, empid);
        else throw new Exception("Access denied");
    }

    @Override
    public EmployeeDo get(String client, int empid) throws Exception{
        if(client.equals("ADMIN"))
        return employeeDAOImpl.get(client, empid);
        else throw new Exception("Access denied");
}
}
