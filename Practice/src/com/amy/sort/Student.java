package com.amy.sort;

public class Student  implements Comparable{
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }

	@Override
	public int compareTo(Object o) {
		int compareage=((Student)o).getStudentage();
		System.out.println("student age is :"+this.studentage+" compare age is:"+compareage);
		System.out.println(this.studentage-compareage);
        /* For Ascending order*/
        return this.studentage-compareage;
	}
	@Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}
