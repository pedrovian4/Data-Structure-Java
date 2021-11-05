package com.company;

public class TestVector {
    public  TestVector(){
        Student student1 = new Student("Pedro");
        Student student2 = new Student("Carlos");
        Student student3 = new Student("Jhon");
        Vector vector = new Vector();
        vector.add(student1);
        vector.add(student2);
        vector.add(student3,1);
        vector.print();

        System.out.println(vector.exist(student3));
    }

}
