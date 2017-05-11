package student;

public enum Course {
JAVA("Java"), CPLUSPLUS("C++"), PHYTON("Phyton");
	private final String course;
	
	Course(String c) {
		course = c;
	}
	
	@Override
	public String toString() {
		return course;
	}
}
