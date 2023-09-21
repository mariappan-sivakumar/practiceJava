package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Modifying {
    public static void main(String[] args) {

        List<String> courses =new ArrayList<>( Arrays.asList("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes"));
//        courses.replaceAll(course->course.toUpperCase());
        courses.replaceAll(String::toUpperCase);
        System.out.println(courses);
        boolean check = courses.removeIf(course -> course.length() < 10);
        System.out.println(courses);
    }
}
