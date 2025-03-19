package logicalAndConditionalOperators;

import java.util.Scanner;

public class Grades {
	static float average;
	static char grade;
	public static float averageMarks(int m1, int m2, int m3)
	{
		average = (float) (m1+m2+m3)/3f;
		return average;
	}
	
	public static char grade(int m1, int m2 , int m3)
	{

		averageMarks(m1,m2,m3);
		
		if(average>=75)
			grade='A';
		else if(average >= 60 && average < 75)
			grade='B';
		else if(average >=40 && average < 60)
			grade='C';
		else
			grade='D';
		
		
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks1,marks2,marks3;
		System.out.println("Enter marks for 3 subjects");
		
		Scanner sc = new Scanner(System.in);
		marks1 = sc.nextInt();
		marks2 = sc.nextInt();
		marks3 = sc.nextInt();
		
		char finalGrade = grade(marks1,marks2,marks3);
		
		System.out.println("Average marks is :- "+averageMarks(marks1,marks2,marks3));
		
		System.out.println("Grade of student is "+finalGrade);
		
		sc.close();
		
	}

}
