package Day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudent;

    public Course(String name, String category, int reviewScore, int noOfStudent) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudent = noOfStudent;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' + ", category='" + category + '\'' + ", reviewScore=" + reviewScore + ", noOfStudent=" + noOfStudent + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }
}

public class FunctionalProgramingWithCustomClass {
    public static void main(String[] args) {
        List<Course> courseList = Arrays.asList(
                new Course("Spring", "FrameWork", 98, 20000),
                new Course("Spring Boot", "FrameWork", 91, 25000),
                new Course("API", "MicroServices", 99, 23000),
                new Course("Azure","MicroServices",97,20000)
        );
        Predicate<Course> reviewGreaterThan90 = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewGreaterThan95 = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewLesserThan90 = course -> course.getReviewScore() < 90;
        Comparator<Course> comparator = Comparator.comparingInt(Course::getNoOfStudent);
        Comparator<Course> decreaseComparator = Comparator.comparingInt(Course::getNoOfStudent).reversed();
        Comparator<Course> comparatorWithStudentAndReview = Comparator.comparingInt(Course::getNoOfStudent).thenComparingInt(Course::getReviewScore).reversed();
        Predicate<Course> reviewGreaterThanValue = getReviewGreaterThanValue(90);


        System.out.println(courseList.stream().allMatch(reviewGreaterThan90));
        System.out.println(courseList.stream().allMatch(reviewGreaterThan95));
        System.out.println(courseList.stream().noneMatch(reviewGreaterThan90));
        System.out.println(courseList.stream().noneMatch(reviewGreaterThan95));
        System.out.println(courseList.stream().noneMatch(reviewLesserThan90));
        System.out.println(courseList.stream().anyMatch(reviewGreaterThan95));
        System.out.println(courseList.stream().anyMatch(reviewLesserThan90));
        System.out.println();
        System.out.println(courseList.stream().anyMatch(reviewGreaterThanValue));
        System.out.println(courseList.stream().anyMatch(getReviewGreaterThanValue(90)));

        System.out.println(courseList.stream().sorted(comparator).collect(Collectors.toList()));
        System.out.println(courseList.stream().sorted(decreaseComparator).collect(Collectors.toList()));
        System.out.println(courseList.stream().sorted(comparatorWithStudentAndReview).collect(Collectors.toList()));
        System.out.println(courseList.stream().sorted(comparatorWithStudentAndReview).limit(2).collect(Collectors.toList()));
        System.out.println(courseList.stream().sorted(comparatorWithStudentAndReview).skip(2).collect(Collectors.toList()));
        System.out.println(courseList.stream().sorted(comparatorWithStudentAndReview).skip(2).limit(1).collect(Collectors.toList()));
//        System.out.println(courseList.stream().takeWhile(course->course.getReviewScore>95).collect(Collectors.toList()));
//        System.out.println(courseList.stream().dropWhile(course->course.getReviewScore>95).collect(Collectors.toList()));
        System.out.println(courseList.stream().max(comparatorWithStudentAndReview));//return last element in the list with the comparator
        System.out.println(courseList.stream().min(comparatorWithStudentAndReview));
        System.out.println(courseList.stream().filter(reviewGreaterThan90).min(comparatorWithStudentAndReview));
        System.out.println(courseList.stream().filter(reviewLesserThan90).min(comparatorWithStudentAndReview));
        System.out.println(courseList.stream().filter(reviewLesserThan90).min(comparatorWithStudentAndReview).
                orElse(new Course("Mariappan","Human",100,1)));
        System.out.println(courseList.stream().filter(reviewGreaterThan90).min(comparatorWithStudentAndReview).orElse(new Course("Mariappan","Human",100,1)));
        System.out.println(courseList.stream().filter(reviewGreaterThan90).findFirst());
        System.out.println(courseList.stream().filter(reviewGreaterThan90).findAny());
        System.out.println(courseList.stream().filter(reviewGreaterThan90).mapToInt(Course::getNoOfStudent).sum());
        System.out.println(courseList.stream().filter(reviewGreaterThan90).mapToInt(Course::getNoOfStudent).average());
        System.out.println(courseList.stream().filter(reviewGreaterThan90).mapToInt(Course::getNoOfStudent).count());
        System.out.println(courseList.stream().filter(reviewGreaterThan90).mapToInt(Course::getNoOfStudent).max());
        System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getCategory)));
        System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));
        System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparingInt(Course::getReviewScore)))));
        System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName,Collectors.toList()))));

    }

    private static Predicate<Course> getReviewGreaterThanValue(int reviewScore) {
        return course -> course.getReviewScore() > reviewScore;
    }


}
