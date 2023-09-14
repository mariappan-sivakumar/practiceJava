public class University {
    public static void main(String[] args) {
        College principal=new College();
        College.Dept hodCSE=new College().new Dept("CSE");
        College.Dept hodMech=principal.new Dept("Mech");
        hodMech.conductSymposium();
        College.Dept hodECE=principal.appointHOD("ECE");
        hodECE.tellingFees();
        College.Dept studentCSE=principal.addStudent("CSE");
        College.Dept studentMech=principal.addStudent("Mech");
        studentCSE.lab=true;
        studentCSE.uniformOrNot();
        studentMech.uniformOrNot();
    }
}
