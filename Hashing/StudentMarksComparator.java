package comparator.com;

import java.util.Comparator;

public class StudentMarksComparator implements  Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getMarks().compareTo(o2.getMarks());
	}

}
