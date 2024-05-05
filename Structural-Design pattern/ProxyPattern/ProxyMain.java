package ProxyPattern;

public class ProxyMain {
   public static void main(String[] args) {
    try{
        EmployeeDAO empTableObj =  new EmployeeDAOProxy();
        empTableObj.create("User", new EmployeeDo());
        
        }
        catch(Exception e ){
            System.out.println(" There was some error "+ e);
        }
   }
}
