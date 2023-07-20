package w3resource.inheritance;
public class HrManagementApp {
    public static void main(String[] args) {
        Employee emp = new Employee(4000);
        HRManagement man = new HRManagement(7000);
        emp.work();
        System.out.println("The salary for employee: "+ emp.getSalary());
        man.work();
        System.out.println("The salary for a manager: "+ man.getSalary());


        System.out.println("The employee name is: " +  man.setEmployee("Bill"));
    }
}

