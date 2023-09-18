package Day10;

import java.util.*;

public class Student {
    private String name;
    private int rollNo;
    private float totalMark;

    private ArrayList<String> sub = new ArrayList<>(Arrays.asList("Tamil", "English", "Maths", "Science", "Social"));
    private HashMap<String, Float> subMark = new HashMap<>(5, 1);

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollNo=" + rollNo + ", Mark=" + subMark + '}'+'\n';
    }

    public HashMap<String, Float> getMarks() {
        return subMark;
    }

    public void enterMark() {
        System.out.printf("Enter Mark of %s%n",name);
        for (String subject : sub) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter Mark for %s: %n", subject);
            Float mark = scanner.nextFloat();
            subMark.put(subject, mark);
            totalMark+=mark;
        }
    }
    public static TreeSet<Student> rollNoOrder(Student... students){
        TreeSet<Student> studentTreeSet=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Integer rollNo1=o1.rollNo;
                Integer rollNo2=o2.rollNo;
                return rollNo1.compareTo(rollNo2);
            }
        });
        for (Student student :
                students) {
            studentTreeSet.add(student);
        }
        return studentTreeSet;
    }
    public static TreeSet<Student> rankOrder(Student... students){
        TreeSet<Student> studentTreeSet=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Float totalMark1=o1.totalMark;
                Float totalMark2=o2.totalMark;
                return totalMark2.compareTo(totalMark1);
            }
        });
        for (Student student :
                students) {
            studentTreeSet.add(student);
        }
        return studentTreeSet;
    }
}
class Classroom{
    public static void main(String[] args) {
        Student mari=new Student("Mari", 1);
        mari.enterMark();
        Student raj=new Student("Raj",2);
        raj.enterMark();
        Student balaji=new Student("Balaji", 3);
        balaji.enterMark();
        Student jeya=new Student("Jeya", 4);
        jeya.enterMark();
        System.out.println(Student.rankOrder(mari,raj,balaji,jeya));
        System.out.println(Student.rollNoOrder(mari,raj,balaji,jeya));
    }
}