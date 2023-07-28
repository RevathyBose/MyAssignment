package week2.day3;

import week2.day2.Department;

public class Student extends Department{
	public void StudentName()
	{
		System.out.println("Student Name is Revathy");
	}
	public void StudentDept()
	{
		System.out.println("Student Dept is Computer science");
	}
	public void StudentID()
	{
		System.out.println("Student ID is 2448790");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student =new Student();
        student.Collegecode();
        student.CollegeName();
        student.collegeRank();
        student.DepartmentName();
        student.StudentID();
        student.StudentName();
        student.StudentDept();
	}

}

