package Tuan1;

import java.util.Scanner;

public class Student {
	public Scanner sr = new Scanner(System.in);
	private String studentName;//Tên học sinh
	private double studentScore;//Điểm học sinh
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
	
	//Nhập thông tin học sinh
	public void input()
	{
		System.out.print("Enter the student name: ");
		String studentName = sr.nextLine();
		this.setStudentName(studentName);
		
		System.out.print("Enter the student score: ");
		double studentScore =  sr.nextDouble();
		this.setStudentScore(studentScore);
	}
	
	//Nhập xuất mảng thông tin học sinh
	public void inputArrayStudent()
	{
		System.out.print("Enter the number of student: ");
		int numberOfStudent = sr.nextInt();
		Student[] studentArray = new Student[numberOfStudent];
		
		for(int i=0;i<numberOfStudent;i++)
		{
			Student student = new Student();
			student.input();
			studentArray[i] = student;
		}
		Student temp;
		for(int i=0;i<studentArray.length-1;i++)
		{
			for(int j=i+1;j<studentArray.length;j++)
			{
				if(studentArray[i].studentScore > studentArray[j].studentScore)
				{
					temp = studentArray[i];
					studentArray[i] = studentArray[j];
					studentArray[j] = temp;
				}
			}
		}
		for(Student student: studentArray)
		{
			if(student.studentScore>=9)
			{
				System.out.println("Student name: " + student.getStudentName() +"\nStudent score: " + student.getStudentScore() +"\nAcademic evaluation: EXCELLENT");
			}
			else if(student.studentScore <9 && student.studentScore >=7.5)
			{
				System.out.println("Student name: " + student.getStudentName() +"\nStudent score: " + student.getStudentScore()+"\nAcademic evaluation: VERY GOOD");
			}
			else if(student.studentScore <7.5 && student.studentScore >=6.5)
			{
				System.out.println("Student name: " + student.getStudentName() +"\nStudent score: " + student.getStudentScore()+"\nAcademic evaluation: GOOD");
			}
			else if(student.studentScore <6.5 && student.studentScore >=5)
			{
				System.out.println("Student name: " + student.getStudentName() +"\nStudent score: " + student.getStudentScore()+"\nAcademic evaluation: AVERAGE GOOD");
			}
			else
			{
				System.out.println("Student name: " + student.getStudentName() +"\nStudent score: " + student.getStudentScore()+"\nAcademic evaluation: ORDINARY");
			}
		}
	}
}