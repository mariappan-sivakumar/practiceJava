package Day4;

public class Main {
    public static void main(String[] args) {
//        Student mari=new Student();
//        mari.setStudentName("Mariappan");
//        mari.setStudentID("ZS-0530");
//        mari.addGrade(95.5);
//        mari.addGrade(99.1);
//        System.out.println(mari.getStudentName()+" "+mari.getStudentID()+" "+mari.getGrades());
        Employee mari=new Employee();
        mari.setEmploeeName("Mariappan");
        mari.setEmployeeID("ZS-0530");
        System.out.printf("Name: %s%nID: %s%nSalary: %s%n",mari.getEmploeeName(),
                mari.getEmployeeID(),mari.getEmployeeSalary());
    }
}
