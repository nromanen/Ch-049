package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import student.Group;
import student.Student;

public class StudentService2 implements Comparator<Student> {

	private Student student1;
	private Student student2;
	private Student student3;

	private List<Student> studList = new LinkedList<Student>();

	public StudentService2() {
		studList.add(student1);
		studList.add(student2);
		studList.add(student3);
	}

	public StudentService2(Student student1, Student student2, Student student3) {
		super();
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

	public Student getStudent1() {
		return student1;
	}

	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

	public Student getStudent2() {
		return student2;
	}

	public void setStudent2(Student student2) {
		this.student2 = student2;
	}

	public Student getStudent3() {
		return student3;
	}

	public void setStudent3(Student student3) {
		this.student3 = student3;
	}

	public List<Student> getStudlist() {
		return studList;
	}

	public void setStudlist(List<Student> studList) {
		this.studList = studList;
	}

	public List<Student> getTheBestStudentByRank(Group g) {
		List<Student> res = new ArrayList<>();

		double maxRank = studList.get(0).getRank();

		for (Student stud : studList) {
			if (stud.getGroup().equals(g) && maxRank < stud.getRank()) {
				maxRank = stud.getRank();
			}
		}

		for (Student stud : studList) {
			if (maxRank == stud.getRank()) {
				res.add(stud);
			}
		}

		return res;

	}

	public void removeStudent() {
		Iterator<Student> iter = studList.iterator();
		while (iter.hasNext()) {
			Student i = iter.next();
			if (i.lessThan(2)) {
				iter.remove();
			}
		}

		System.out.println(studList);

	}

	public List<Student> listsByCourse(Course course) {

		Iterator<Student> iter2 = studList.iterator();
		List<Student> courseStud = new ArrayList<Student>();

		while (iter2.hasNext()) {
			Student st = iter2.next();
			if (st.getCourse() == course) {
				courseStud.add(st);

			}

		}
		/*while (iter2.hasNext()) {
			Student st = iter2.next();
			if (st.getCourse() == Course.CPLUSPLUS) {
				courseStud.add(st);

			}
		}
		while (iter2.hasNext()) {
			Student st = iter2.next();
			if (st.getCourse() == Course.PHYTON) {
				courseStud.add(st);

			}

		}*/

		return courseStud;

	}

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getLastName().compareTo(o2.getLastName());
	}

}
