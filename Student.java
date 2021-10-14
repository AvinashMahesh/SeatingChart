public class Student {

	private String name;
	private int absences;
	
	public Student (String n, int abs) {
		name = n;
		absences = abs;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAbsenceCount() {
		return absences;
	}
	
	public String toString() {
		return name + " has " + absences + " absences.";
	}
}
