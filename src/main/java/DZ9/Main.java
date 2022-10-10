package DZ9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("course1");
        Course course2 = new Course("course2");
        Course course3 = new Course("course3");
        Course course4 = new Course("course4");
        Course course5 = new Course("course5");
        Course course6 = new Course("course6");
        Course course7 = new Course("course7");
        Course course8 = new Course("course8");
        Course course9 = new Course("course9");
        Student student1 = new Student("student1", Arrays.asList(course1, course4, course6));
        Student student2 = new Student("student2", Arrays.asList(course3, course4, course9, course2));
        Student student3 = new Student("student3", Arrays.asList(course3, course4, course9, course6, course8));
        Student student4 = new Student("student4", Arrays.asList(course3, course4));


        List<Course> listOfUniqueCourses = getListOfUniqueCourses(Arrays.asList(student1, student2));
        listOfUniqueCourses.forEach(course -> System.out.println(course.getName()));
        List<Student> listOfSmartStudents = getListOfSmartStudents(Arrays.asList(student1, student2, student3, student4));
        listOfSmartStudents.forEach(student -> System.out.println(student.getName()));
        getListOfStudentsToCourse(Arrays.asList(student1,student2,student3,student4), course9).forEach(student -> System.out.println(student.getName()));


    }

    public static List<Course> getListOfUniqueCourses(List<Student> students) {
        return students.stream().flatMap(student -> student.getCourseList().stream()).distinct().toList();
    }

    public static List<Student> getListOfSmartStudents(List<Student> students) {
        return students.stream().sorted((s1,s2)-> -1*Integer.compare(s1.getCourseList().size(), s2.getCourseList().size())).limit(3).toList();
    }
    public static List<Student> getListOfStudentsToCourse(List<Student> students, Course course) {
        return students.stream().filter(student -> student.getCourseList().contains(course)).toList();
    }
}
