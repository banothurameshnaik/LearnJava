package comparator.com;

import java.util.Comparator;

public class StudentQualComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getQual().compareTo(o2.getQual());
	}

}
