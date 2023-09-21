package Day15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
        System.out.println(courses.stream().collect(Collectors.joining(", ")));
        System.out.println(courses.stream().map(course->course.split("")).collect(Collectors.toList()));
        System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
        System.out.println(courses.stream().map(course->courses.stream().map(course2->Arrays.asList(course,course2))).collect(Collectors.toList()));
        System.out.println(courses.stream().flatMap(course->courses.stream().map(course2->Arrays.asList(course,course2))).collect(Collectors.toList()));
        System.out.println(courses.stream().flatMap(course->courses.stream().map(course2->Arrays.asList(course,course2))).filter(list->!list.get(0).equals(list.get(1))).collect(Collectors.toList()));
        System.out.println(courses.stream().flatMap(course->courses.stream().filter(course2->course2.length()==course.length()).map(course2->Arrays.asList(course,course2))).filter(list->!list.get(0).equals(list.get(1))).collect(Collectors.toList()));

    }
}
