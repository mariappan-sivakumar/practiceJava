package Day4;

public class Employee {
    private String emploeeName;
    private String employeeID;
    private int employeeSalary=26455;

    public String getEmploeeName() {
        return emploeeName;
    }

    public void setEmploeeName(String emploeeName) {
        this.emploeeName = emploeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeSalary() {
        return String.format("$%d",employeeSalary);
    }


}
