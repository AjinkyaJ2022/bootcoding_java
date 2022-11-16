package com.bootcoding.exception.filehandling;

public class Subjects {
    public static void main(String[] args) {
        Subjects subjects=new Subjects();
        Student Ramesh=subjects.Convert("Ramesh,75,82,73,67");
    }
    public Student Convert(String text){
        Student student=new Student();
      String[]token  =text.split(",");
      student.setName(token[0]);
        student.setPhysics(Integer.parseInt(token[1]));
        student.setChemistry(Integer.parseInt(token[2]));
        student.setMaths(Integer.parseInt(token[3]));
        student.setHistory(Integer.parseInt(token[4]));
        return student;


    }
}
