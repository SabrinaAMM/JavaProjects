package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Teacher tom = new Teacher(1, "Tom", 3000);
		Teacher anna = new Teacher(2, "Anna", 3000);
		Teacher sandra = new Teacher(3, "Sandra", 3600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(tom);
		teacherList.add(anna);
		teacherList.add(sandra);
		
		Student lisa = new Student(1, "Lisa", 4);
		Student christian = new Student(2, "Christian", 5);
		Student sebastian = new Student(2, "Sebastian", 10);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(lisa);
		studentList.add(christian);
		studentList.add(sebastian);
		
		
		School jgg = new School(teacherList, studentList);
		System.out.println("Earnings: " + jgg.getTotalEarnings() + " €");
		
		lisa.payFees(200);
		christian.payFees(300);
		
		System.out.println("JGG has earned €"+ jgg.getTotalEarnings());
		
		
		System.out.println("Paying Salary....");
		tom.receiveSalary(tom.getSalary());
		System.out.println("JGG has spent for salary " + jgg.getTotalEarnings());
	}

}
