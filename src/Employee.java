public class Employee {
    private String name;
    private int year;
    private String address;
    private int workingHour;
    private int salary;

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public String getInfo() {
        return name + "      " + year + "            " + address;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (workingHour < 6) {
            salary += 5;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", workingHour=" + workingHour +
                ", salary=" + salary +
                '}';
    }
}
