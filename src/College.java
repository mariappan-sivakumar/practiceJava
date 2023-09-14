public class College {
    static String principalName="George Klington";
    int fees=27000;
    String uniform="College doesn't have Uniform code";
    public Dept appointHOD(String deptName){
        return new Dept(deptName);
    }
    public Dept addStudent(String deptName){
        return new Dept(deptName);
    }
    protected class Dept{
        String deptName;
        String uniform= "If there is practical Student must be in Lab uniform";
        boolean lab=false;
        public void uniformOrNot(){
            if(lab==true) {
                System.out.println(uniform);
            }
            else {
                System.out.println(College.this.uniform);
            }
        }
        public void tellingFees(){
            System.out.printf("As per Principal %s's statement our academic fees is Rs.%d%n",principalName,fees);
        }

        public Dept(String deptName) {
            this.deptName = deptName;
        }

        public void conductSymposium(){
            System.out.printf("%s Department Conducting Symposium%n", deptName);
        }
    }
}
