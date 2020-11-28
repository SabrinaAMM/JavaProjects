package SchoolManagementSystem;

import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalEarnings;
	private static int totalSpendings;
	
	
	
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalEarnings = 0;
		totalSpendings = 0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public int getTotalEarnings() {
		return totalEarnings;
	}

	public static void updateTotalEarnings(int earnings) {
		totalEarnings += earnings;
	}

	public int getTotalSpendings() {
		return totalSpendings;
	}

	public static void updateTotalSpendings(int spendings) {
		totalSpendings += spendings;
	}
	
	

}
