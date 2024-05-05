package ProxyPattern;

public interface EmployeeDAO {
    public void create(String client, EmployeeDo obj) throws Exception;
    public void delete(String client, int empid) throws Exception;
    public EmployeeDo get(String client, int empid) throws Exception;

}
