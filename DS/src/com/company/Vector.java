package com.company;
import java.util.Arrays;

public class Vector {

    private   Student[] students = new Student[100];

    private int studentsSize= 0;

    public  void add (Student student){
            this.increase();
            this.students[this.studentsSize]= student;
            this.studentsSize++;}

    public  void add(Student student, int position){

                    //time execution is O(n);
                    this.increase();

                    if(!(fulfilled_1(position))){
                        throw new IllegalArgumentException("the position is not valid");
                    }
                  for(int i = studentsSize-1; i>=position;i--){
                      students[i+1]= students[i];
                  }
                  this.students[position]= student;
                  studentsSize++;
    }
    private  boolean fulfilled(int position){
        boolean b = position < this.studentsSize && position >= 0;
        return b;
    }

    private  boolean fulfilled_1(int position){

        return position<=this.studentsSize && position>=0;
    }
    public  Student get(int position){

        if (!(fulfilled(position))) {
            return students[position];
        }
        throw new IllegalArgumentException("this position is not valid");
    }

    private void increase(){
        if(this.studentsSize==this.students.length){
            Student[] newArray= new Student[this.students.length*2];
            for(int i = 0; i <this.students.length; i++){
                newArray[i]= students[i];
            }
            this.students = newArray;
            // reference of pointer is passed
        }
    }

    public void remove(int position){
        for (int i= position; i < this.studentsSize; i++){
            this.students[i]= this.students[i+1];}
        this.students[this.studentsSize]=null;
        this.studentsSize--;

    }

    public  boolean exist(Student student){

        for(int i = 0; i<this.studentsSize; i++){
            if(student.equals(this.students[i])){
                return true;
            }
        }

        return false;}

    public  int size(Student student){
        return this.studentsSize;}

    public String toString(){
        return Arrays.toString(students);
    }

    public void print (){
        for (int i =0; i<this.students.length; i++){
            System.out.println(this.students[i]);
        }
    }

}
