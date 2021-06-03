package fu.util;

import fu.main.MyToys;
import lab.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        System.out.println("PI again: " + MyToys.PI);
        int number = MyToys.getAnInteger();
        System.out.println("Number: " + number);
        number = MyToys.getAnInteger("Vui lòng nhập chiều rộng: ");
        System.out.println("Chiều rộng là: " + number);
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student("B", "SE150182"));
        listStudents.add(new Student("A", "SE150182"));
        listStudents.add(new Student("D", "SE150182"));
        listStudents.add(new Student("C", "SE150182"));

        // sort list student by it's name ASC
        System.out.println("sort list student by it's name ASC: ");
        listStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student object1, Student object2) {
                return object2.getStudentName().compareTo(object1.getStudentName());
            }
        });
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

//        // sort list student by it's age ASC
//        System.out.println("sort list student by it's age ASC: ");
//        Collections.sort(listStudents, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() > o2.getAge() ? 1 : -1;
//            }
//        });
//        // show list students
//        for (Student student : listStudents) {
//            System.out.println(student.toString());
//        }
    }
}
