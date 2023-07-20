package w3resource.inheritance;

public class HRManagement extends Employee{
    String employee;
    public HRManagement (int salary){
        super(salary);
    }
    public void work(){
        System.out.println("Working as a manager");
    }
    public String setEmployee(String employee){
       //this.employee = employee;
       return employee;
    }
}