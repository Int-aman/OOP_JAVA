package com.ultralesson.oopjava.objects.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ExamEligibility {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Barrett Lee",62));
        studentList.add(new Student("Matthew Moore", 29));
        studentList.add(new Student("Nellie Mcgrath", 18));
        studentList.add(new Student("Jerrod Blair", 59));
        studentList.add(new Student("Jack Mccoy", 70));
        studentList.add(new Student("Andy Farrell", 60));

        for(Student student:studentList){
            if(student.marks>35)
                System.out.println(student.getName());
        }
    }
    private static class Student {
        private String name;
        private Integer marks;

        public Student(Integer marks) {
            this.marks = marks;
        }

        public Student(String name, Integer marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getMarks() {
            return marks;
        }

        public void setMarks(Integer marks) {
            this.marks = marks;
        }

    }
}
