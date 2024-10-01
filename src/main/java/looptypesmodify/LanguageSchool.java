package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        Student firstStudent = new Student("Toth Janos");
        Student secondStudent = new Student("Nagy Istvan");
        Student thirdStudent = new Student("Kovacs Peter");
        Student fourthStudent = new Student("Kiss Jozsef");

        studentList.add(firstStudent);
        studentList.add(secondStudent);
        studentList.add(thirdStudent);
        studentList.add(fourthStudent);

        for (Student s: studentList){
            System.out.println(s.getName());
        }
        System.out.println(studentList.size()+" student");

        secondStudent.setActive(false);
        fourthStudent.setActive(false);

        List<Student> studentRemove = new ArrayList<>();

        for (Student s: studentList){
            if (!s.isActive()){
                studentRemove.add(s);
            }
        }

        studentList.removeAll(studentRemove);

        System.out.println("Inactive:");
        for (Student s: studentRemove){
            System.out.println(s.getName());
        }
        System.out.println(studentList.size()+" student removed");
    }
}
