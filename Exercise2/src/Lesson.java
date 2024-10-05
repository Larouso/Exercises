public class Lesson {
	private String lesson_title;
	private String semester;
	private String lecturer;
	private double credits;
	
	public Lesson(String title, String semester, String lecturer, double credits) {
		this.lesson_title = title;
		this.semester = semester;
		this.lecturer = lecturer;
		this.credits = credits;
	}
	
	public String getLesson_title() {
		return lesson_title;
	}
	public void setLesson_title(String lesson_title) {
		this.lesson_title = lesson_title;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public void printAll() {
		System.out.println("Title: " + lesson_title + "\n" + "Semester: " + semester + "\n" + "Lecturer: " + 
	lecturer + "\n" + "ECTS: " + credits);
	}
}
