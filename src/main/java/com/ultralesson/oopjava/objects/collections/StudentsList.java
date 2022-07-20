package com.ultralesson.oopjava.objects.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class StudentsList {

    //Challenge 1: Find all students above 8 years and print their names
    //Challenge 2: Find all students in class 6
    //Challenge 3: Sort students by age, name and class.

    public void printList(List<Student> students){
        for (Student student : students) {
            System.out.println("Name: " + student.name + " Age: " + student.age + " Class: " + student.classNo);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        StudentsList ob = new StudentsList();

        //Challenge 1
        System.out.println("Results for challenge 1");
        for (Student student : students) {
            if (student.age > 8)
                System.out.println(student.name);
        }
        //Challenge 2
        System.out.println("Results for challenge 2");
        for (Student student : students) {
            if (student.classNo == 6)
                System.out.println(student.name);
        }
        //Challenge 3

        //sorting by name
        Collections.sort(students, new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println("Printing list sorted by names");
        ob.printList(students);

        //sorting by age
        Collections.sort(students, new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                return s1.age-s2.age;
            }
        });
        System.out.println("Printing list sorted by age");
        ob.printList(students);

        //sorting by classNo
        Collections.sort(students, new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                return s1.classNo-s2.classNo;
            }
        });
        System.out.println("Printing list sorted by classNo");
        ob.printList(students);

    }
    private static class Student {
        private String name;
        private int age;
        private int classNo;

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
        }
    }
}