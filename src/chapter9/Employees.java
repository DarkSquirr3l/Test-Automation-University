package chapter9;

public class Employees extends Person{

    private String employeeId;
    private String title;

    public Employees(){
        super("Kath");                           //will call the relevant constructor of the super class
        System.out.println("Employees");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
