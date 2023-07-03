package employeeManager;

public class manager extends employee {
    private String department;

    public manager(String name, int age, String address, double salary, String department) {
        super(name, age, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

}
